package java_assignment;
import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=(num1-num2*(num1/num2));
		System.out.println("Remainder is of "+num1+" is "+sum);
		sc.close();
	}

}
