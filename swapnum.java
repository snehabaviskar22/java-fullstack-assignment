package assignments;
import java.util.Scanner;
public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers for swapping :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Before Swapping : "+num1+" "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping : "+num1+" "+num2);
		sc.close();
	}

}
