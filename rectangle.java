package java_pro;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the lengtn and breadth of a rectangle :");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double area= l*b;
		System.out.println("Area of rectangle is :"+area);
		area=sc.nextDouble();
	}

}
