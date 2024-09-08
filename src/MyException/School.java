package MyException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import MyException.TempException.InvalidAgeException;
import MyException.TempException.InvalidEmailException;
import MyException.TempException.InvalidPasswordException;

public class School {
    public void login(int age, String email, String password){
        if (age<5) {
            throw new InvalidAgeException();
        }
        if (!(email.contains("@gmail.com")) || !(email.contains("@Yahoo.com"))) {
            throw new InvalidEmailException();
        }
        Pattern p = Pattern.compile("[A-Za-z][0-9]");
        Matcher m = p.matcher(password);
        if (!(m.find())) {
            throw new InvalidPasswordException("wrong Password");
        }
    }
    public void home(){
        System.out.println("Welcome to the School ");
    }
}
