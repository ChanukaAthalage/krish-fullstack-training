package ChainOfresponsibility;

public class PasswordCheck extends Handler{


    @Override
    void CheckValidate(CheckSuccoer checkSuccoer) {
        String passWord = checkSuccoer.user.getPassword();
        String upp = "(.*[A-Z].*)";
        String low = "(.*[a-z].*)";
        String num = "(.*[0-9].*)";
        if (passWord.length() > 8 && passWord.matches(upp) && passWord.matches(low) && passWord.matches(num)) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Please enter the valid Password");
        }
    }
}
