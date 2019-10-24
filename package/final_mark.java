import see.External;
import cie.*;
import java.util.*;
class final_main extends External
{
	int[] fin_mark=new int[5];
	void calc()
	{
		for(int i=0;i<5;i++)
		{
			fin_mark[i]=see_mark[i]+int_mark[i];
		 	System.out.println("Final mark: "+fin_mark[i]);
		}
	}
}

class main1
{
	public static void main(String arg[])
	{
		
		 System.out.println("Enter the number of students : ");
         Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 final_main[] stud =new final_main[n];
		 for(int i=0;i<n;i++)
		 {	 
		 	 stud[i]=new final_main();
			 stud[i].get_data();
			 stud[i].get_marks();
			 stud[i].get_see();
			 stud[i].calc();
		 }
	}
}
