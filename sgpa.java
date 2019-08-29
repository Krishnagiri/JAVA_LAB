import java.util.*;
class sgpa
   {
     int n;
     int marks[];
     int credits[];
     int grades[];
     float total_credits=0;
    
     float total=0;
     
     sgpa(int n)
     {this.n=m
      this.marks=new int[n];;
      this.credits=new int[n];
      this.grades=new int[n];
       
       
       }
     
     void calc1()
     {
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<n;i++)
      {
        System.out.println("Enter sub marks");
        marks[i]=sc.nextInt();
        System.out.println("Enter sub creds");
        credits[i]=sc.nextInt();
        total_credits+=credits[i];
       }
       
       
     void calcf()
     {
       for(int i=0;i<n;i++)
       {
          if(marks[i]<=90)
            {
             grades[i]=10;
             total+=grades[i]*credits[i];
             }
           else  if(marks[i]<=75)
            {
             grades[i]=9;
             total+=grades[i]*credits[i];
             }
            else if(marks[i]<=60)
            {
             grades[i]=8;
             total+=grades[i]*credits[i];
             }
            else if(marks[i]<=50)
            {
             grades[i]=7;
             total+=grades[i]*credits[i];
             }
            else if(marks[i]<=40)
            {
             grades[i]=6;
             total+=grades[i]*credits[i];
             }
             else 
            {
             grades[i]=0;
             total+=0;
             }
             
             }
             
             }
              void display()
              {
               System.out.println(" sgpa= " +total/total_credits);
              } }
               
        class sgpamain
        {
         public static void main(String args[])
         {Scanner sc=new Scanner(System.in);
          System.out.println("Enter no of subjects");
          int n=sc.nextInt();
          sgpa s1=new sgpa(n);
          s1.calc1();
          s1.calcf();
          s1.display();}
          }       
       
