class oddContinue
{
	public static void main(String args[])
	{

	 for(int i=1;i<10;i+=2)
	 {
	     for(int j=1;j<10;j+=2)
	     {

	     if(j%2==0)
	     {

	     continue;
	     }
	     System.out.println(j);
	     }
	     System.out.println("odd");
	 }
	}
}