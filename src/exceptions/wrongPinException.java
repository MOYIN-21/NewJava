package exceptions;

public class wrongPinException extends Throwable {
    public wrongPinException(String wrongPin) {
        super(wrongPin);
    }
}
