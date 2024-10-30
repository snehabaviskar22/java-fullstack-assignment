package java_pro;
import java.util.Scanner;

public class Acsii 
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character :");
		ch=sc.next().charAt(0);
		
		int n= ch;
		
		System.out.println("the ascii value of entered character is:"+n);
		
			

	}

}
