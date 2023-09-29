package exceptions;

public class invalidCredentialsException extends Throwable {
    public invalidCredentialsException(String accountNumberNotFound) {
        super(accountNumberNotFound);
    }
}
