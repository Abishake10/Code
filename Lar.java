import java.util.*;
class Lar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(b[j]);
		}
	}
}
