import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            int multi = n*i;
            System.out.println(multi);
        }
    }
}
