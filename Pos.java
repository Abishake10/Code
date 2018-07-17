import java.util.*;
class Pos
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a<0)
		{
			System.out.print("Negative");
		}
		else if(a>0)
		{
			System.out.print("positive");
		}
		else
		{
			System.out.print("Zero");
		}
	}
}
