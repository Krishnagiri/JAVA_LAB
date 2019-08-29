import java.util.*;
class time
{
 int hr,min;
 time(){hr=0;min=0;}
 time(int h,int m)
  { hr=h;min=m; } 
 void acceptin()
  { Scanner sc=new Scanner(System.in); 
    System.out.println("Input hr and min");
    hr=sc.nextInt();
    min=sc.nextInt();
  }
 time add(time t)
 { 
   time temp=new time();
   temp.hr=hr+t.hr;
   temp.min=min+t.min;
   if(temp.min>=60)
   { temp.hr++;
     temp.min=temp.min=60;
    }
    return temp;
    }
  void display()
  { System.out.println(hr+""+min);}
  }
  
  class timemain
  {
    public static void main(String[] args)
    {
     time t1=new time(10,25);
     time t2=new time();
     time t3=new time();
     t2.acceptin();
     t3=t1.add(t2);
     t1.display();
     System.out.println("t2 details:");
     t2.display();
     System.out.println("SUn of t1 & t2:");
     t3.display();
     }
     }
