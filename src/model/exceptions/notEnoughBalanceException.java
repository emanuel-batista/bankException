package model.exceptions;

public class notEnoughBalanceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public notEnoughBalanceException(String msg){
        super(msg);
    }
}
