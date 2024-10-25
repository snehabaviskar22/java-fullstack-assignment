package java_pro;
import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radius;
		final double pi= 3.14;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius of circle : ");
		radius=sc.nextInt();
		
		double area=pi*radius*radius;
		System.out.println("Area of circle is : "+area);
		
		double circumference=2*pi*radius;
		System.out.println("Circumference of circle is : "+circumference);
	}

}
