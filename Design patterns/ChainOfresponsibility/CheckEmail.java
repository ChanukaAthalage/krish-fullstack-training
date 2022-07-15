package ChainOfresponsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail extends Handler{


    @Override
    void CheckValidate(CheckSuccoer checkSuccoer) {
        String email = checkSuccoer.user.getEmail();
        String patt = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()){
            System.out.println("Please Add valid email");
        }else {
            this.handler.CheckValidate(checkSuccoer);
        }

    }
}
