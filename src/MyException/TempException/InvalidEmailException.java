package MyException.TempException;

public class InvalidEmailException extends RuntimeException {
    private String msg = "Email must Contail @gmail.com or @Yahoo.com";
    public String toString(){
        return "InvalidEmail:"+msg;
    }
}
