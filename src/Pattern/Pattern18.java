package Pattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=0,st=n;
		for(int i=1;i<=n;i++)
		{
			
			
			
			for(int j=1;j<=sp;j++)
				System.out.print("\t");
			
			if(i>1 && i<=n/2)
			{
			for(int j=1;j<=st;j++)
			{
			if(j==1 || j==st)
				System.out.print("*"+"\t");
			else
				System.out.print("\t");
			}
			
			}
			
			else
			{
				for(int j=1;j<=st;j++)
					System.out.print("*"+"\t");
			}
			
			
			if(i<=n/2)
			{
				sp++;
				st=st-2;
			}
			
			else
			{
				sp--;
				st=st+2;
			}
			
			
			System.out.println();
		}
		sc.close();
	}
}
