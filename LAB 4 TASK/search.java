import java.util.Scanner; 
class Search
{
	 public static void main(String args[])
	 {
	    int array[];
	    Scanner x=new Scanner(System.in);

	    System.out.println("Enter number of elements");
	    int n=x.nextInt();
	    array=new int[n];
	    System.out.println("Enter"+n+"Integers");
	    

	    for(int i=0;i<n;i++)
	    array[i]=x.nextInt();
	    System.out.println("Enter value to find");

	    int search=x.nextInt();

	    for(int i=0;i<n;i++)
	    {

	        if(array[i]==search)
	        {
	           System.out.println(search+"is present at the location="+(i+1)+"");
	           break;
	        }
	    }
	   
	    
	    
	          System.out.println(search+"is not found");
	    
	    

	 }
}