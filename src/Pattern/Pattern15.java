package Pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
				System.out.print("\t");
			
			if(i<=n/2)
			{
			int val=i;
			for(int j=1;j<=st;j++)
			{
				System.out.print(val+"\t");
				if(j<=st/2)
				{
					val++;
				}
				else
				{
					val--;
				}
			}
			}
			
			else
			{
				int val=n-i+1;
				for(int j=1;j<=st;j++)
				{
					System.out.print(val+"\t");
					if(j<=st/2)
					{
						val++;
					}
					else
					{
						val--;
					}
				}
			}
			
			
		
			
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			
			else
			{
				sp++;
				st=st-2;
			}
			
			System.out.println();
		}
		sc.close();
	}
}
