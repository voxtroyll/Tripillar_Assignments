import java.sql.SQLOutput;
import java.util.Scanner;
public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:" );
        int n = sc.nextInt();
        if (n > 0){
            System.out.println(":Positive Number");

        } else if (n == 0) {
            System.out.println("Number is Zero");

        }else {
            System.out.println("Number is Negative.");
        }
    }
}
