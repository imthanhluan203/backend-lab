package lab.m01.w01.d06;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(Throwable cause) {
        super("Account Not Found Exception: ",cause);
    }
}
