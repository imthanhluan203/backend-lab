package lab.m01.w01.d02.Good;

public final class Employee {
    private String name;
    private double salary;
    private CompensationPolicy compensationPolicy;

    public Employee(String name, double salary, CompensationPolicy compensationPolicy) {
        this.name = name;
        this.salary = salary;
        this.compensationPolicy = compensationPolicy;
    }

    public double bonus(){
        return compensationPolicy.calculateBolus(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public CompensationPolicy getCompensationPolicy() {
        return compensationPolicy;
    }

    public void setCompensationPolicy(CompensationPolicy compensationPolicy) {
        this.compensationPolicy = compensationPolicy;
    }
}
