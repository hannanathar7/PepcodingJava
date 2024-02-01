package Array;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int b=sc.nextInt();
		int n=0,f=1;
		while(d!=0)
		{
			int r=d%b;
			n=n+r*f;
			f=f*10;
			d=d/b;
		}
		System.out.println(n);
		sc.close();
	}
}
