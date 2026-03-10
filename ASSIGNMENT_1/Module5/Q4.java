package Module5;

public class Q4 {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues after handling exception");
    }
}