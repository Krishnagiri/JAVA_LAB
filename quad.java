import java.util.*;
class Quadratic 
{
int a,b,c,d;
double result1,result2;
Quadratic()
{}
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the coefficient of x^2,xand the constant term");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
}
void process()
{
d=(b*b)-(4*a*c);
if(d>0)
System.out.println("the roots are real and different");
else if (d==0)
System.out.println("the roots are equal");
else
System.out.println("the are imaginary");
}
void result()
{
result1=((-b)+ Math.sqrt(d))/(2*a);
result2=((-b)-Math.sqrt(d))/(2*a);
System.out.println("the roots are root 1:"+ result1 +"the root 2 is :" + result2);
}
}
class main
{
public static void main(String xx[])
{
Quadratic q=new Quadratic();
q.accept();
q.process();
q.result();
}
}
