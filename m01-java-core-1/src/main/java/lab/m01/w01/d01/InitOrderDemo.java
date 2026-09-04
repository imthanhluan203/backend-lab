package lab.m01.w01.d01;

public class InitOrderDemo {


    private static String fieldStatic = init("Static Field");

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    private String instanceField = init("Instance Field");

    public InitOrderDemo(){
        System.out.println("constructor no parameter");
    }

    public InitOrderDemo(String message){
        this();
        System.out.println(message);
    }

    private static String init(String message){
        System.out.println(message);
        return "Static Field";
    }

    public static void main(String[] args) {
        new InitOrderDemo("x1");
        System.out.println("=".repeat(100));
        new InitOrderDemo("x2");
    }
}
