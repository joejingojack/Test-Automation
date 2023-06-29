package WebApiAutomation.entities;

public class User {

    //For tests using JsonObject
    public static final String LOGIN = "login";
    public static final String ID = "id";

    private String login;
    private int Id;

    public String getLogin() {
        return login;
    }

    public int getId() {
        return Id;
    }
}
