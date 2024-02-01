package Array;
import java.util.*;
public class DifferenceOfTwoArrays {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		
		sc.close();
		
		int sum[]=new int[Math.max(n1,n2)];
		
		int i=n1-1,j=n2-1,k=sum.length-1,c=0;
		while(i>=0 && j>=0)
		{
			int s=b[j]-a[i]+c;
			if(s<0)
			{
				s=s+10;
				c=-1;
			}
			else
			{
				c=0;
			}
			sum[k]=s;
			i--;
			j--;
			k--;
		}
		
		while(i>=0)
		{
			int s=a[i]+c;
			c=0;
			sum[k]=s;
			i--;
			
			k--;
		}
		
		
		while(j>=0)
		{
			int s=b[j]+c;
			c=0;
			sum[k]=s;
			j--;
			k--;
		}
		
		if(sum[0]!=0)
		{
			System.out.println(sum[0]);
		}
		
		for(i=1;i<sum.length;i++)
		{
			System.out.println(sum[i]);
		}
		
					
		
	}
}
