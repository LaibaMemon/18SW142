class evenContinue
{
	public static void main(String args[])
	{
	 for(int i=0;i<10;i+=2)
	 {
	    for(int j=0;j<10;j+=2)
	    {


	        if(j%2==1)
	        {
	        continue;}

	        System.out.println(j);
	        
	       
	    }
	    System.out.println("Even");
	 }
	}
}