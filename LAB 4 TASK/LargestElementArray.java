 import java.util.Scanner;
 class LargestElementArray
 {
	  public static void main(String args[])
	  {
         
	      int max;
	      Scanner x=new Scanner(System.in);
	      System.out.println("Enter number of elements in array");

	      int n=x.nextInt();
	      int a[]=new int[n];
	      System.out.println("Enter elements of array");
	      
	      for(int i=0;i<n;i++)
	      {
	      	a[i]=x.nextInt();
	      }
               max=a[0];
             for(int i=0;i<n;i++)
          {

          	if(max<a[i])
          	{

          		max=a[i];
          	}
          }
           System.out.println("Largest value:"+max);
}

	  }
