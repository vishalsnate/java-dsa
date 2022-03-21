import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count=2;
        while(count <= n)
        {
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
 
class Main
{
 public static void main(String args[])
 {
         int i,c=0,n;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number to generate fibonacci series upto nth term");
     n=sc.nextInt();
   int a=0;
   int b=1;
 
 System.out.println("Fibonacci series upto "+n+" is :-");
   while(c!=n)
   {
       System.out.print(c+" ");
       a=b;
       b=c;
       c=a+b;
   }
 }
}
