package lab.m01.w01.d03;

public record Transfer(String source, String target) implements Transaction {
    @Override
    public int amountOfMoney() {
        return 0;
    }

    @Override
    public int time() {
        return 0;
    }
}
