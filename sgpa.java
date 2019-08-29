import java.util.*;
class stud
{
	String name=new String(); 
	String usn=new String();
	int marks[] = new int[5];
	int cred[] = new int[5];
	int grad[] = new int[5];
	double sgpa;
	
	void get_data()
	{Scanner s = new Scanner(System.in);
	 System.out.println("Enter the name of student");
	name = s.next();
	System.out.println("Enter the usn of student");
	usn = s.next();
	System.out.println("Enter the marks in 5 subjects");
	for(int i=0;i<5;i++)	
	{marks[i] = s.nextInt();}
	System.out.println("Enter the credits ");
	for(int i=0;i<5;i++)	
	{cred[i] = s.nextInt();}
	}
		
	void calc()
	{
	 for(int i=0;i<5;i++)
	 {if(marks[i]>=90)
		grad[i]=10;
	 else if(marks[i]<90&&marks[i]>=75)
	  	grad[i]=9;
	else if(marks[i]<75&&marks[i]>=60)
	        grad[i]=8;
	else if(marks[i]<60&&marks[i]>=50)
		grad[i]=7;
	else if(marks[i]<50&&marks[i]>=45)
		grad[i]=5;
	else if(marks[i]<45&&marks[i]>=40)
		grad[i]=4;
	else if(marks[i]<40)
		grad[i]=0;
	}
	}
 	void disp()
	{
	System.out.println("Name of student :" + name);
	System.out.println("USN of Student  :" + usn);
	System.out.println("SGPA of student :" +sgpa);
	}
	void calc_sgpa()
	{int tot_crd=0;int tot=0;
	 for(int i=0;i<5;i++)
	{tot_crd+=cred[i];}
	 for(int i=0;i<5;i++)
	{tot+=grad[i]*cred[i];}
	sgpa=tot/tot_crd;
	}
}
class sgpa
{
	public static void main(String x[])
	{stud s1=new stud();
	s1.get_data();
	s1.calc();
	s1.calc_sgpa();
	s1.disp();
	}
}
