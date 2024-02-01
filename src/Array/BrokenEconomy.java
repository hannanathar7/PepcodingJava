package Array;
import java.util.*;
public class BrokenEconomy 
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
		int idx=-1;
		int mid=0;
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(d>a[mid])
			low=mid+1;
			else if(d<a[mid])
				high=mid-1;
			else
			{
				idx=mid;
				break;
			}
			
			
		}
		if(idx==-1)
		{
			System.out.println(a[low]);	
			System.out.println(a[high]);
		}
		else
			System.out.println(a[mid]);
		sc.close();
	
		
		
	}
}
