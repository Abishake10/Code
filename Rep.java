import java.util.*;
class Lar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
				if(a[i]==a[j])
				{
					count++;
				}
				}
			}
			if(count==0)
			{
				System.out.print(a[i]+" ");
			}
			count=0;
		}
	}
}
