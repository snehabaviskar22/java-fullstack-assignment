package java_pro;
import java.util.Scanner;

 class student_1
{
	    String name;
		int rollno;
		public student_1()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter stud name :");
			name=sc.next();
			System.out.println("enter stud rollno :");
			rollno=sc.nextInt();	
		}
}
	 
 class studentgrade extends student_1 {
	
	 int m1,m2,m3,m4,m5;
	public studentgrade()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of 5 subject :");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		int totalmarks=m1+m2+m3+m4+m5;
		
		if( totalmarks >= 400 && totalmarks<=500)
		{
			System.out.println("Grade:  A");
		}
		else if(totalmarks <= 400 && totalmarks >= 300 )
		{
			System.out.println("Grade:  B");
		}
		else if(totalmarks <= 300 && totalmarks >= 200 )
		{
			System.out.println("Grade:  C");
		}
		else if(totalmarks <= 200 && totalmarks >= 100 )
		{
			System.out.println("Grade:  D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
 }
 public class student1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//student_1 s =new student_1();
		studentgrade s1=new studentgrade();

	}

}