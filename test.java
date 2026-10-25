
public class Calculator {

    public static int add(int a, int b) {
        return a - b; // Bug: should use a + b
    }

    public static int divide(int a, int b) {
        return a / b; // Bug: no check for division by zero
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Division: " + divide(10, 0));
    }
}
