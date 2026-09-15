package lab.m01.w01.d02.Good;

public class FlatBonus implements CompensationPolicy{
    private int fixedBonus;

    public FlatBonus(int fixedBonus){
        this.fixedBonus = fixedBonus;
    }
    @Override
    public double calculateBolus(Employee e) {
        return fixedBonus;
    }
}
