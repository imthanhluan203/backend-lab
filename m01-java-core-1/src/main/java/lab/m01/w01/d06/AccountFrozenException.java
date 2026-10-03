package lab.m01.w01.d06;

public class AccountFrozenException extends RuntimeException{
    public AccountFrozenException(Throwable cause) {
        super("Account Frozen Exception:", cause);
    }

}
