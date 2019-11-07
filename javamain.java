import java.util.*;
class AgeException extends Exception
{ String d;
 AgeException(String e)
  {
   d=e;
   }
  public String toString()
  {
  return("the age of son can't be greater than father or it cant be 0:"+ d);
  }
 
 }
 class father
 {
  int age;
  father()
  {}
  Scanner s=new Scanner(System.in);
  void indata() throws AgeException
  { System.out.println("enter the age of father :");
    age=s.nextInt();
    if (age<=0)
    {
     throw new AgeException("error");
    }
   }
   void output()
   {
   System.out.println("the age of father is:"+ age);
   }
  }
 
  class son extends father
  {
   int son_age;
   son()
   {}
   Scanner s=new Scanner(System.in);
   void input() throws AgeException
   { super.indata();
    System.out.println("enter the age of son:");
    son_age=s.nextInt();
    if (son_age<=0 || son_age>age)
    {
     throw new AgeException("error");
     }
    }
     void outputdata()
   {super.output();
   System.out.println("the age of son  is:"+ son_age);
   }
    }
     class javamain
     {
       public static void main(String xx[])
        {
        try{
          son s=new son();
          s.input();
          s.outputdata();
          }
          catch(AgeException e)
          {
          System.out.println(e);
          }
         }
        }
