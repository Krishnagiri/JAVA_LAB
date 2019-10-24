package cie;
import java.util.*;

class Student
{	
	
	 String usn = new String();
  	 String name = new String();
 	 int sem;
 	public void get_data()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name,usn and semester ");
		name=s.next();
		usn=s.next();
		sem=s.nextInt();
	}
}

public class Internal extends Student
{	

	Scanner s = new Scanner(System.in);
	public int[] int_mark = new int[5];
	public void get_marks()
	{
		System.out.println("Enter the Internal marks in 5 subjects ");
        for(int i=0;i<5;i++)
			int_mark[i]=s.nextInt();
	}
}

