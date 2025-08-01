public class UnauthorizedModelException extends Exception{
    public UnauthorizedModelException (String message){
        super(message);
    }
    public String toString(){
        return "UnauthorizedModelException: "+getMessage();
    }
}
