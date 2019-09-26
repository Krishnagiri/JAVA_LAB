import java.util.*;

abstract class shape
{
	int a;
	abstract void printarea();
}

class triangle extends shape
{	
	Scanner s = new Scanner(System.in);
	int b;	
	double area;
	void printarea()
	{
	System.out.print("Enter the base and height  ");
	a = s.nextInt();
	b = s.nextInt();
	area=0.5*a*b;
	System.out.println("Area of triangle : "+area);
	}
}

class rectangle extends shape
{
	Scanner s = new Scanner(System.in);
	int b;	
	double area;
	void printarea()
	{
	System.out.print("Enter the length and breadth ");
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
	System.out.print("Enter the radius ");
	a = s.nextInt();
	area=3.14*a*a;
	System.out.println("Area of circle: "+area);
	}
}


class main1
{
public static void main(String a[])
{	Scanner s = new Scanner(System.in);
	int ch;
	do{	
	System.out.print("Press \n1 for area of rectangle\n2 for area of triangle\n3 for area of circle : ");
	ch=s.nextInt();
	switch(ch)	
	{case 1 :{rectangle r=new rectangle();
		r.printarea();}break;
	case 2: {triangle t = new triangle();
		t.printarea();}break;
	case 3:{circle c = new circle();
		c.printarea();}break;
	case 4:System.out.println("Enter correct choice ");
	
	}
	}while(ch>0 && ch<5);

}
}
