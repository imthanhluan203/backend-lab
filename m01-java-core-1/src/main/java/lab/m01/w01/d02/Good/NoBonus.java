package lab.m01.w01.d02.Good;

public class NoBonus implements CompensationPolicy{
    @Override
    public double calculateBolus(Employee e) {
        return 0;
    }
}
