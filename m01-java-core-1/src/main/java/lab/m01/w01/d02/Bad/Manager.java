package lab.m01.w01.d02.Bad;

public class Manager extends Employee {
    public Manager(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + 5_000_000;
    }
}

