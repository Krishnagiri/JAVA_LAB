import java.util.*;
class book
{
	String name;
	String author;
	double price;
	int pages;
	
	book()
	{
		name="THE WOLF OF WALL STREET";
		author="SIDDHARTHA";
		price=350.50;
		pages=420;
	}
	
	void setdata()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input book details");
		System.out.println("Enter name of the book");
		name=s1.next();
		System.out.println("Enter name of the author");
		author=s1.next();
		System.out.println("Enter price of the book");
		price=s1.nextInt();
		System.out.println("Enter the no. of pages");
		pages=s1.nextInt();	
		
	}
	public String toString()
	{
		return("\nName:"+name+"\nAuthor:"+author+"\nPrice:"+price+"\nPages:"+pages+"\n");
	}
	
	
	

}
class bookmain
{
	public static void main(String argX[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of objects");
		int n=s.nextInt();
		book b[]=new book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new book();
			b[i].setdata();
			System.out.println(b[i]);
		}
	}
}
