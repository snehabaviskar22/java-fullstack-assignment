package java_pro;
import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        
        double sqrRoot = Math.sqrt(number);
        
        System.out.println("The square root of " + number + " is " + sqrRoot);
    
    }
}
