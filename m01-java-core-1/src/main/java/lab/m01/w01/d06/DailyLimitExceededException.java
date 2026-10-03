package lab.m01.w01.d06;

public class DailyLimitExceededException extends RuntimeException {
    public DailyLimitExceededException(Throwable cause) {
        super("Daily Limit Exceeded Exception: ",cause);
    }
}
