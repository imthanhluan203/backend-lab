package lab.m01.w01.d04;

public class Main {
    public static void main(String[] args) {
        Money a = Money.of("1000", "VND");
        Money b = Money.of("1000", "VND");
        System.out.println(a.equals(a));
        System.out.println(a.equals(b));
        System.out.println(a.equals(null));
        System.out.println(a.hashCode() == b.hashCode());
    }
}
