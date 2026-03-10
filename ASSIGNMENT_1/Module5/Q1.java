package Module5;

import java.io.FileReader;

public class Q1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (Exception e) {
            System.out.println("Checked Exception: File not found");
        }

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Unchecked Exception: " + e);
        }
    }
}