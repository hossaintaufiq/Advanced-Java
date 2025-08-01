public class UnapprovedItemException extends Exception{
    public UnapprovedItemException(String massage){
        super(massage);
    }
    public String toString(){
        return "UnapprovedItemException "+getMessage();
    }
}
