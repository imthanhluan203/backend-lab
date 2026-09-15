package lab.m01.w01.d02.Bad;

public class Intern extends Employee{
    public Intern(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return 0;
    }
}
