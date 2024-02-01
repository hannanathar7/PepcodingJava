package Array;
import java.util.*;
public class RotateAnArray 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		k=k%n;
		if(k<0)
		{
			k=k+n;
		}
		if(k==0)
		{
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			return;
		}
		int b[]=new int[n];
		b[k-1]=a[n-1];
		int i=0;
		while(k<n)
		{
			b[k]=a[i];
			i++;
			k++;
		}
		k=0;
		while(i!=n-1)
		{
			b[k]=a[i];
			i++;
			k++;
		}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
		
	}
}
