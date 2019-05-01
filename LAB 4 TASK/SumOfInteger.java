import java.util.Scanner;

class SumOfInteger
{
	public static void main(String args[])
	{

	 int y=1;
	 Scanner x=new Scanner(System.in);

	 System.out.print("Enter the number");
	 int n=x.nextInt();
     
     for(int i=1;i<=n;i++)
     {

     y+=i;
     }
     System.out.println("Sum of n numbers:"+y);
	}
}