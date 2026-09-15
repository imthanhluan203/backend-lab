package lab.m01.w01.d02.Good;

public class TieredBonus implements CompensationPolicy {

    @Override
    public double calculateBolus(Employee e) {
        double bonus = 0.0;
        if(e.getSalary() < 10){
            bonus = e.getSalary() * 5/100;
        } else if (e.getSalary() >= 10 && e.getSalary() <=30) {
            bonus = e.getSalary() * 10/100;
        } else {
            bonus = e.getSalary() * 15/100;
        }
        return bonus;
    }
}
