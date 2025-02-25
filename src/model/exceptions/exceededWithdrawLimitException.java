package model.exceptions;

public class exceededWithdrawLimitException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public exceededWithdrawLimitException(String msg){
        super(msg);
    }
}
