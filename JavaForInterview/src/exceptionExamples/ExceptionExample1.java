package exceptionEx;

public class ExceptionExample1 {
    public static void main(String[] args){


        try{
            //code the generate exception
            int divideByZero = 5/0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            throw new RuntimeException("Arithmetic Exception ->"+ e.getMessage());
        }finally {
            System.out.println("This is finally block");
        }
    }
}
