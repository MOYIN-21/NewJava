package exceptions;

public class negativeAmountCanNotBeDeposited extends Throwable {
    public negativeAmountCanNotBeDeposited(String canNotDepositNegativeAmount) {
        super(canNotDepositNegativeAmount);
    }
}
