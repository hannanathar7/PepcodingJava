package Array;
import java.util.*;
public class SubsetsOfArray 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int limit=(int)Math.pow(2, n);
		
		for(int i=0;i<limit;i++)
		{
			String set="";
			int temp=i;
			for(int j=n-1;j>=0;j--)
			{
				int r=temp%2;
				temp=temp/2;
				if(r==0)
				{
					set="-"+"\t"+set;
				}
				else
				{
					set=a[j]+"\t"+set;
				}
			}
			System.out.println(set);
			
		}
		
	}
}
