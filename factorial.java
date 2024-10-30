package java_pro;
import java.util.Scanner;

public class factorial
	{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a positive number : ");
        int number = sc.nextInt();
			        
        long factorial = calculateFactorial(number);
            
        System.out.println("Factorial of " +number+ " is " +factorial);
     }

		    public static long calculateFactorial(int num)
		    {
		        long result = 1;

		        for (int i = 1; i <= num; i++)
		        {
		            result *= i; 
		        }
		        return result;	
	}
}
