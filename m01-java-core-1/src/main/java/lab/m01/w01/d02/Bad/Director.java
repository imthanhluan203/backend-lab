package lab.m01.w01.d02.Bad;

public class Director extends Manager {
    public Director(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() * 1.5;
    }
}
