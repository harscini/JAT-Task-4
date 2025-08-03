package learnings;
import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		int prime=0;
		
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		for(int i=2; i<=n-1; i++) {
			if(n%2==0) {
				prime++;
				break;
				
			}
		}
		if(prime==0) {
			System.out.println(n+ " is prime number");
		}
		else
		{
			System.out.println(n+ " is not a prime number");
		}
	}
}
