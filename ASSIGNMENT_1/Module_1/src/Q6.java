import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        if (  n == 1 ){
            System.out.println("Prime No.");
        } else if ( n % 2 == 0 && n % n == 0 || n % 2 != 0 ) {
            System.out.println("Prime No");
        }else {
            System.out.println("NOt a Prime .");
        }
    }
}



// code is not working fully