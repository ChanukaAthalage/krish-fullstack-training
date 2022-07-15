package ChainOfresponsibility;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String email;
        String password;

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter Your email : ");
        email = scanner.nextLine();

        System.out.println("Enter Your Password : ");
        password = scanner.nextLine();

        CheckEmail checkEmail = new CheckEmail();
        PasswordCheck passwordCheck = new PasswordCheck();
        User user = new User(email,password);
        CheckSuccoer checkSuccoer = new CheckSuccoer(user);

        checkEmail.setHandler(passwordCheck);
        checkEmail.CheckValidate(checkSuccoer);

//        System.out.println("Email " + email + "password "+ password);
    }
}
