package exceptions;

public class InsufficientFundException extends Throwable {
    public InsufficientFundException(String insufficientFund) {
        super(insufficientFund);
    }
}
