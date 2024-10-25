package java_pro;
import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double principal,rate,time,compoundint_time,simple_interest,compound_interest;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount :");
		principal=sc.nextDouble();
		System.out.println("enter rate of interest :");
		rate=sc.nextDouble();
		System.out.println("enter time period :");
		time=sc.nextDouble();
		System.out.println("enter number of times compound interest applied per time period :");
		compoundint_time=sc.nextDouble();
		
		simple_interest=(principal*rate*time)/100;
		System.out.println("simple interest is : "+simple_interest);
		
		compound_interest=principal*Math.pow((1+(rate/100)/compoundint_time),compoundint_time*time)-principal;
		System.out.println("Compound  interest is : "+compound_interest);
	}

}
