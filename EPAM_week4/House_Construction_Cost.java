import java.util.*;
import java.io.*;
import java.lang.*;
class StandardMaterial
{
    int cost_per_square_feet=1200;
	double ConstructionCost(double area)
	{
	    return area*cost_per_square_feet;
	}
}
class AboveStandardMaterial
{
  int cost_per_square_feet=1500;
  double ConstructionCost(double area)
  {
	return area*cost_per_square_feet;
	}
}
class HighStandardMaterial
{
  int cost_per_square_feet=1800;
  double ConstructionCost(double area)
  {
	return area*cost_per_square_feet;
	}
}
class HighStandardMaterial_Automated
{
  int cost_per_square_feet=2500;
  double ConstructionCost(double area)
  {
	return area*cost_per_square_feet;
	}
}
class House_Construction_Cost
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
	  System.out.println("enter the area of the house in square feet");
	  double area=in.nextDouble();
	  System.out.println("enter your choice of standerd of material:");
	  System.out.println("1.standard material");
	  System.out.println("2.Above standard material");
	  System.out.println("3.High standard material");
	  int ch;
	  ch=in.nextInt();
	  if(ch==1)
	  {
	      StandardMaterial ob1=new StandardMaterial();
		  System.out.print("the cost of house when constructed with standerd material:");
		  System.out.println(ob1.ConstructionCost(area));
		 }
	  else if(ch==2)
	  {
	      AboveStandardMaterial ob2=new AboveStandardMaterial();
		  System.out.print("the cost of house when constructed with above standerd material:");
		  System.out.println(ob2.ConstructionCost(area));
		 }
	  else if(ch==3)
	  {
	      System.out.println("do you want automated:1-yes/0-no:");//1 indicates automated and 0 indicates not automated
		  int s;
		  s=in.nextInt();
		  
		  if(s==1)
		  {
		    HighStandardMaterial_Automated ob2=new HighStandardMaterial_Automated();
		    System.out.print("the cost of house when constructed with high standerd material with automation:");
		    System.out.println(ob2.ConstructionCost(area));
			}
		else{
		    
	      HighStandardMaterial ob2=new HighStandardMaterial();
		  System.out.print("the cost of house when constructed with high standerd material:");
		  System.out.println(ob2.ConstructionCost(area));
		   }
		 }
  }	
}  
	  
	  
	  
