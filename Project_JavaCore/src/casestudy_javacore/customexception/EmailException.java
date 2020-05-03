package casestudy_javacore.customexception;

public class EmailException extends Exception {
    public EmailException(String message){
        super(message);
    }
}
