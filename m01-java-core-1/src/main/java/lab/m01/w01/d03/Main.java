package lab.m01.w01.d03;

public class Main {
    private static void describe(Transaction transaction){
        switch (transaction){
            case FeeCharge(String reason) -> System.out.println("This is fee charge with reason: " + reason);
            case Deposit(double money) -> System.out.println("This is deposit with money: " + money);
            case Transfer(String source, String target) -> System.out.printf("This is tranfer from %s to %s%n",source,target);
            case Withdrawal(double money) -> System.out.println("This is withdraw: " + money);
            default -> throw new IllegalStateException("Unexpected value: " + transaction);
        }
    }

    private static int riskScore(Transaction transaction){
        int score = switch (transaction){
            case FeeCharge(String reason) -> 0;
            case Deposit(double money) when money > 5000 -> 60;
            case Deposit(double money) when money <= 5000 -> 30;
            case Transfer(String source, String target) when source.equalsIgnoreCase(target) -> 50;
            case Transfer(String source, String target) when !source.equalsIgnoreCase(target) -> 80;
            case Withdrawal(double money) when money > 500 -> 70;
            case Withdrawal(double money) when money <= 500 -> 30;
            default -> throw new IllegalStateException("Unexpected value: " + transaction);
        };
        return score;
    }

    public static void main(String[] args) {
        describe(new FeeCharge("FeeCharge"));
        describe(new Deposit(100.01));
        describe(new Transfer("VietNam", "United Kingdom"));
        describe(new Withdrawal(1435));
        System.out.println(riskScore(new FeeCharge("FeeCharge")));
        System.out.println(riskScore(new Deposit(6000)));
        System.out.println(riskScore(new Transfer("VietNam", "United Kingdom")));
        System.out.println(riskScore(new Withdrawal(1435)));
    }
}
