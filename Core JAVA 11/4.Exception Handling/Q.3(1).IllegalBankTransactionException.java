package ExceptionHandle;

@SuppressWarnings("serial")
public class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String message){
        super(message);
    }
}