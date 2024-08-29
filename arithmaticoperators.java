package assignments;
import java.util.Scanner;

public class arithmaticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double num1,num2,sum;
	int n;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers :");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Modulas");
	System.out.println("enter your choice :");
	n=sc.nextInt();
	
	switch(n)
	{
	case 1:
		sum=num1+num2;
		System.out.println("Addition is "+sum);
	break;
	
	case 2:
		sum=num1-num2;
		System.out.println("substrction is "+sum);
	break;
	
	case 3:
		sum=num1*num2;
		System.out.println("Multiplication is "+sum);
	break;
	
	case 4:
		sum=num1/num2;
		System.out.println("Division is "+sum);
	break;
	
	case 5:
		sum=num1%num2;
		System.out.println("Modulas is "+sum);
	break;
	
	default:
		System.out.println("Invalid choice! ");
	}
	sc.close();
}

}
	
	
