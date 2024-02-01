package Array;

import java.util.Scanner;

public class AnyBaseMultiplication {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int f=1,c=0,s=0,sum=0,d=0,res=0,n3;
		while(n1!=0)
		{
			int d1=n1%10;
			d++;
			n3=n2;
		while(n3!=0 || c!=0)
		{
			int d2=n3%10;
			int s1=d1*d2+c;
			s=s1%b;
			c=s1/b;
			sum=sum+s*f;
			f=f*10;
			
			n3=n3/10;
		}
		f=(int)Math.pow(10,d);
		res=sum(res,sum,b);
		sum=0;
		n1=n1/10;
		}
		
		System.out.println(res);
		sc.close();
	}
	
	public static int sum(int n1,int n2,int b)
	{
		int f=1,c=0,s=0,sum=0;
		while(n1!=0 || n2!=0 || c!=0)
		{
			int d1=n1%10;
			int d2=n2%10;
			int s1=d1+d2+c;
			s=s1%b;
			c=s1/b;
			sum=sum+s*f;
			f=f*10;
			n1=n1/10;
			n2=n2/10;
		}
		
		return sum;
	}
}
