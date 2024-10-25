package java_pro;
import java.util.Scanner;

public class findcharac {
	
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character :");
		ch=sc.next().charAt(0);
		
		if(Character.isDigit(ch))
		{
			System.out.println(" The entered Character is a digit.");
		}
		else if(Character.isLetter(ch))
		{
			System.out.println(" The entered Character is a letter.");
		}
		else {
			System.out.println(" The entered Character is a special symbol.");
		}
	}

}
