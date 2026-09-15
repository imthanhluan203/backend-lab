package lab.m01.w01.d02.Bad;

public class PayrollReport {
    public static double monthlyBonus(Employee e){
        return e.calculateBonus() / 12;
    }

    public static double howManyCanWeAfford(double budget, Employee e){
        return Math.min(budget, e.calculateBonus());
    }

    public static void main(String[] args) {
        System.out.println(howManyCanWeAfford(10000, new Manager(5000)));
        System.out.println(howManyCanWeAfford(10000, new Intern(1000)));
    }
}
