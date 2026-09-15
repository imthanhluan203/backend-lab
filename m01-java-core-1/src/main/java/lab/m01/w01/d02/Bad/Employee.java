package lab.m01.w01.d02.Bad;

public class Employee {
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }
    public double calculateBonus(){
        return salary / 10;
    }
}


