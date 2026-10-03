package lab.m01.w01.d06;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Throwable cause) {
        super("Insufficient Funds Exception: ",cause);
    }
}
