package ChainOfresponsibility;

public class User {

    private final String email;
    private final String Password;

    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return Password;
    }

    public User(String email, String password) {
        this.email = email;
        Password = password;
    }
}
