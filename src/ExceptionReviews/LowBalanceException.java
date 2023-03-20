package ExceptionReviews;

public class LowBalanceException extends RuntimeException {
    LowBalanceException(String msg){
        super(msg);
    }

}