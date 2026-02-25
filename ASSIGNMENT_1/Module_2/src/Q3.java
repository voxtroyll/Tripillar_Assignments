public class Q3{
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 : " + add(5, 10));
        System.out.println("Sum of 3 : " + add(5, 10, 15));
        System.out.println("Sum of 2 : " + add(2.5, 3.5));
    }
}