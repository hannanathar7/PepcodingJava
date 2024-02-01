package Array;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int r1=AnyBaseToDecimal(n,b1);
		int r2=DecimalToAnyBase(r1,b2);
		System.out.println(r2);
		sc.close();
		
	}
	
	public static int AnyBaseToDecimal(int n,int b)
	{
		int f=1;
		int d=0;
		while(n!=0)
		{
			int r=n%10;
			d=d+r*f;
			f=f*b;
			n=n/10;
		}
		return d;
	}
	
	public static int DecimalToAnyBase(int n,int b)
	{
		int d=0,f=1;
		while(n!=0)
		{
			int r=n%b;
			d=d+r*f;
			f=f*10;
			n=n/b;
		}
		
		return d;
	}
}
