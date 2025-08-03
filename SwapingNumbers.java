package learnings;
import java.util.Scanner;
public class SwapingNumbers{
	public static void main(String[] args){
	  Scanner scanner= new Scanner(System.in);
	  System.out.println("Enter first num");
	  int num1= scanner.nextInt();
	  System.out.println("Enter second num");
	  int num2= scanner.nextInt();

	  System.out.println("Before Swapping: num1=" + num1+", num2= "+num2);
	  int temp=num1;
	  num1=num2;
	  num2=temp;
	  
	  System.out.println("After Swapping: num1=" + num1+", num2= "+num2);

	  scanner.close();
	}
}
