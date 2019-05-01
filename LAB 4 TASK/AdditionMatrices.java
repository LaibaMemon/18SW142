import java.util.Scanner;
class AdditionMatrices
{
	public static void main(String args[])
	{
	 
	 Scanner x=new Scanner(System.in);

	 System.out.println("Enter the number of rows");
     System.out.println("Enter the number of columns");

      int a,b;
	  a=x.nextInt();
	 b=x.nextInt();

     int first[][]=new int[a][b];
     int second[][]=new int[a][b];

     int sum[][]=new int[a][b];

     System.out.println("Enter elements of first matrix");
     for(int i=0;i<a;i++)
     {
     for(int j=0;j<b;j++)
     {
     	first[i][j]=x.nextInt();
}
     }
     System.out.println("Enter elements of second matrix");
     for(int i=0;i<a;i++)
     {
     	for(int j=0;j<b;j++)
     	{
     		second[i][j]=x.nextInt();
     	}
     }
     System.out.println("new matrix after sum");
     for(int i=0;i<a;i++)
     {
     	for(int j=0;j<b;j++)
     	{
     		sum[i][j]=first[i][j]+second[i][j];
     		System.out.println(sum[i][j]+ "\t");
     	}
     	System.out.println();
     }
     }


	
}