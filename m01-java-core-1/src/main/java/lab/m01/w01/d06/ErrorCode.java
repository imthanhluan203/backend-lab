package lab.m01.w01.d06;

public enum ErrorCode {
    ACCOUNT_NOT_FOUND {
        @Override
        RuntimeException errorCode(Throwable err) {
            return new AccountNotFoundException(err);
        }
    },
    INSUFFICIENT_FUNDS {
        @Override
        RuntimeException errorCode(Throwable err) {
            return new InsufficientFundsException(err);
        }
    },
    ACCOUNT_FROZEN {
        @Override
        RuntimeException errorCode(Throwable err) {
            return new AccountFrozenException(err);
        }
    },
    DAILY_LIMIT_EXCEEDED {
        @Override
        RuntimeException errorCode(Throwable err) {
            return new DailyLimitExceededException(err);
        }
    },
    TRANSFER_FAILED {
        @Override
        RuntimeException errorCode(Throwable err) {
            return new RuntimeException("Transfer fail: ", err);
        }
    };


    abstract RuntimeException errorCode(Throwable err);
}
