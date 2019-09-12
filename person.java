//Write a prg to create a class 'person' . Let the members be name and address of the person . create a ////class student which extends person. The members of the class are marks of 3 subs m1 m2 m3 and class . Test //these two classes by calculating average marks of a given student . Use super to pass values to parent.
import java.util.*;

class person
{
String name=new String();
String add=new String();
}

class student extends person
{	
	Scanner s = new Scanner(System.in);
	int m1,m2,m3;
	double avg;
	String cls=new String();
	System.out.print("Enter the Name of student : ")
	name=s.next();
	System.out.print("Enter the Address of student : ")
	add=s.next();
	System.out.print("Enter the marks of 3 subject of student : ")
	m1=s.nextInt();
	m2=s.nextInt();
	m3=s.nextInt();
	System.out.print("Enter class of student : ")
	cls=s.next();
	
	
