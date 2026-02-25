import java.util.Scanner;
public class Q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Num1 is greater.");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("Num2 is greater.");

        }else{
            System.out.println("Num3 is greater.");
        }
    }
}
