package MyException.TempException;

public class InvalidAgeException extends RuntimeException {
    private String msg = "Age Should be Greather than 5";
    public String  toString(){
        return "InvalidAge"+msg;
    }    
}
