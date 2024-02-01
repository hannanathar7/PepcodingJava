package Array;

import java.util.Scanner;

public class AnyBaseSubtraction {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int f=1,c=0,s=0,sum=0;
		while(n2!=0)
		{
			int d1=n1%10;
			int d2=n2%10;
			if(c==1)
				d2--;
			int s1=d2-d1;
			if(s1<0)
			{
				s=s1+b;
				c=1;
			}
			else
			{
				s=s1;
				c=0;
			}
			sum=sum+s*f;
			f=f*10;
			n1=n1/10;
			n2=n2/10;
		}
		
		System.out.println(sum);
		
		
		sc.close();
	}
}
