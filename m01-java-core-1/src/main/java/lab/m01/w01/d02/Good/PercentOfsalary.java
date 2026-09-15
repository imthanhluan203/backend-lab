package lab.m01.w01.d02.Good;

public class PercentOfsalary implements CompensationPolicy {
    private int percent;

    public PercentOfsalary(int percent){
        this.percent = percent;
    }

    @Override
    public double calculateBolus(Employee e) {
        return e.getSalary() * percent / 100;
    }

}
