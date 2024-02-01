package Array;

import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
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
		
		System.out.println(sum);
		
		
		
		sc.close();
	}
}
