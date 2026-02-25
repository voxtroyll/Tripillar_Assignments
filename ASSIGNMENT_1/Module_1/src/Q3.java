import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid";
        }

        switch (grade) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println(" C");
                break;
            case "D":
                System.out.println("D");
                break;
            case "F":
                System.out.println("F");
                break;
            default:
                System.out.println("Invalid Marks");
        }
    }
}