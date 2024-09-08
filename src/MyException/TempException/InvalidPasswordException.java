package MyException.TempException;

public class InvalidPasswordException extends RuntimeException{
    private String msg = "InvalidPassword";
    public InvalidPasswordException(String msg){
        this.msg = msg;
    }
    InvalidPasswordException(){
        toString();
    }
    public String toString(){
        return ""+msg;
    }
    
}
