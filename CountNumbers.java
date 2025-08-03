package learnings;
import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
        int n = 12345678; 
        int count = 0;

        while (n > 0) {
            n /= 10; 
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
