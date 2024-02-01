package Pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1)
					System.out.print(a+"\t");
				
				else if((i==2) && (j==1))
					System.out.print(b+"\t");
				
				else
				{
					c=a+b;
					a=b;
					b=c;
					System.out.print(c+"\t");
				}
				
			}
			System.out.println();
			
			
		}
		sc.close();
	}
}
