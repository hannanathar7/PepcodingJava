package Array;
import java.util.*;
public class SumOfTwoArrays {

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
			int s=a[i]+b[j]+c;
			sum[k]=s%10;
			c=s/10;
			i--;
			j--;
			k--;
		}
		
		while(i>=0)
		{
			int s=a[i]+c;
			sum[k]=s%10;
			c=s/10;
			i--;
			
			k--;
		}
		
		
		while(j>=0)
		{
			int s=b[j]+c;
			sum[k]=s%10;
			c=s/10;
			j--;
			k--;
		}
		
		if(c>0)
			System.out.println(c);
		
		
		
		
		
		for(i=0;i<sum.length;i++)
		{
			System.out.println(sum[i]);
		}
		
					
		
	}
}
