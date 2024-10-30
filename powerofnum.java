package java_pro;
import java.util.Scanner;
import java.lang.Math;

public class powerofnum 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the base number: ");
	        double base = sc.nextDouble();

	        System.out.print("Enter the exponent: ");
	        double exponent = sc.nextDouble();

	        double result = Math.pow(base, exponent);
       
        System.out.println(base+" raised to the power of " +exponent+ " is = "+ result);
        
    }
}