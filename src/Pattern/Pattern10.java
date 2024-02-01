package Pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp1=n/2,sp2=-1,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp1;j++)
				System.out.print("\t");
			
			for(int j=1;j<=st;j++)
			{
				System.out.print("*"+"\t");
			}
			
			for(int j=1;j<=sp2;j++)
				System.out.print("\t");
			
			if((i>1)&&(i<n))
			{
				for(int j=1;j<=st;j++)
					System.out.print("*"+"\t");
			}
			
			if(i<=n/2)
			{
				sp1--;
				sp2=sp2+2;
			}
			
			else
			{
				sp1++;
				sp2=sp2-2;
			}
			
			System.out.println();
		}
		sc.close();
	}
}
