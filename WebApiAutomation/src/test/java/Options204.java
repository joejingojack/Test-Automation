import WebApiAutomation.ResponseUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.impl.client.CloseableHttpClient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Options204 extends BaseClass {

    CloseableHttpClient client;
    CloseableHttpResponse response;
    @Test
    public void optionsReturnsCorrectMethodsList() throws IOException {

        String header = "Access-Control-Allow-Methods";
        String expectedReply = "GET, POST, PATCH, PUT, DELETE";

        HttpOptions request = new HttpOptions(BASE_ENDPOINT);
        response = client.execute(request);

        String actualValue = ResponseUtils.getHeader(response, header);
        Assert.assertEquals(actualValue, expectedReply);
    }

}
