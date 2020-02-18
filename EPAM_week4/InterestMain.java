import java.lang.*;
import java.io.*;
import java.util.*;

abstract class Interest
{
    abstract double CalculateInterest(int p,float t,float r);
}	
class SimpleInterest extends Interest
{
     public double CalculateInterest(int p,float t,float r)
	{
	      return p*t*r/100;
	}
}
class CompoundInterest extends Interest
{
	int n;
	CompoundInterest(int n1)
	{
		this.n=n1;
	}
     public double CalculateInterest(int p,float t,float r)
    {
		 
		 return p*Math.pow((1+r/n),n*t);
	}
		
}
class InterestMain
{
   public static void main(String args[])
    {
       Interest ob1=new SimpleInterest();
	   
		int p,n;
		float r,t;
		Scanner in=new Scanner(System.in);
		System.out.println("enter principle amount");
		p=in.nextInt();
		System.out.println("enter rate of interest:");
		r=in.nextFloat();
		System.out.println("enter time interval:");
		t=in.nextFloat();
		System.out.print("The simple Interest Calculated is:");
		
		System.out.println(ob1.CalculateInterest(p,t,r));
		System.out.println("enter the number of times the interest is compounded anually");
		n=in.nextInt();
		Interest ob2=new CompoundInterest(n);
		System.out.print("The compound Interest Calculated is:");
		System.out.println(ob2.CalculateInterest(p,t,r));
	}
}	