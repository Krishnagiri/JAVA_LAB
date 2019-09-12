import java.util.*;

class shape
{
	int a;
	int b;
	void printarea()	
	{}
}

class triangle extends shape
{	
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.print("Enter the base and height triangle  ");
	a = s.nextInt();
	b = s.nextInt();
	area=0.5*a*b;
	System.out.println("Area of triangle : "+area);
	}
}

class rectangle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.print("Enter the length and breadth of rectangle  ");
	a = s.nextInt();
	b = s.nextInt();
	area=a*b;
	System.out.println("Area of rectangle: "+area);
	}
}


class  circle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.print("Enter the radius circle  ");
	a = s.nextInt();
	area=3.14*a*a;
	System.out.println("Area of circle: "+area);
	}
}


class main1
{
public static void main(String a[])
{
	rectangle r=new rectangle();
	r.printarea();
	triangle t = new triangle();
	t.printarea();
	circle c = new circle();
	c.printarea();
}
}
