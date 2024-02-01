package Array;
import java.util.*;
public class FirstIndexAndLastIndex 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int d=sc.nextInt();
		int low=0,high=n-1;
		
		int mid=0,lowidx=-1,highidx=-1;
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(d>a[mid])
			low=mid+1;
			else if(d<a[mid])
				high=mid-1;
			else
			{
				lowidx=mid;
				high=mid-1;
			}
			
			
		}
		low=0;
		high=n-1;
		
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(d>a[mid])
			low=mid+1;
			else if(d<a[mid])
				high=mid-1;
			else
			{
				highidx=mid;
				low=mid+1;
			}
			
			
		}
		
			System.out.println(lowidx);	
			System.out.println(highidx);
		
		sc.close();
	
		
		
	}
}
