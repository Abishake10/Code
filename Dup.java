import java.util.*;
class Dup
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int count=0,b=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b++;
				}
			}
			if(count>0)
			{
				System.out.print(a[i]+" ");
			}
			count=0;
		}
		if(b==0)
		{
			System.out.print("Unique");
		}
	}
}
