package exceptionEx;

public class ThrowExample {
    public static void divideByZero() {
        throw new ArithmeticException("Try dividing by Zero");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
