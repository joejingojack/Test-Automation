import WebApiAutomation.ResponseUtils;
import WebApiAutomation.entities.NotFound;
import WebApiAutomation.entities.RateLimit;
import WebApiAutomation.entities.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class BodyTestWithSimpleMap extends BaseClass {
    CloseableHttpClient client;
    CloseableHttpResponse response;

    @Test
    public void returnsCorrectLogin() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/joejingojack");

        response = client.execute(get);

        User user = ResponseUtils.unmarshallGeneric(response, User.class);

        Assert.assertEquals(user.getLogin(), "joejingojack");
    }


    @Test
    public void returnsCorrectId() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/joejingojack");

        response = client.execute(get);

        String jsonBody = EntityUtils.toString(response.getEntity());

        JSONObject jsonObject = new JSONObject(jsonBody);

        Integer loginValue = (Integer) getValueFor(jsonObject, "ID");

        Assert.assertEquals(loginValue, Integer.valueOf(11834443));
    }

    @Test
    public void NotFoundMessageIsCorrectLogin() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/nonexistingendpoint");

        response = client.execute(get);

        NotFound notFoundMessage = ResponseUtils.unmarshallGeneric(response, NotFound.class);

        Assert.assertEquals(notFoundMessage.getMessage(), 11834443);
    }

    @Test
    public void correctRateLimitsAreSet() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/rate_limit");

        response = client.execute(get);

        RateLimit rateLimits = ResponseUtils.unmarshallGeneric(response, RateLimit.class);

        assertEquals(rateLimits.getCoreLimit(), 60);
        assertEquals(rateLimits.getSearchLimit(), "10");
    }

    private Object getValueFor(JSONObject jsonObject, String key) {
        return jsonObject.get(key);
    }
}
