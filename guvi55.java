import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,n1,n2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	n1=sc.nextInt();
	n2=sc.nextInt();
	n=n1*n2;
	if(n%2==0)
	{
		System.out.println("even");
	}
	else
	{
	System.out.println("odd");
	
	}
	}
}
