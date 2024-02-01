package Array;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int f=1;
		int d=0;
		while(n!=0)
		{
			int r=n%10;
			d=d+r*f;
			f=f*b;
			n=n/10;
		}
		System.out.println(d);
		sc.close();
	}
}
