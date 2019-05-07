class Spliting 
{
	public  static void main(String [] args)
	{
		String s="Natasha , 18  , software";
		String d="laiba  , 142  , software";
		String [] a=s.split(", " , 3);
		String [] b=d.split(", " , 3);
		System.out.println("Student 1");
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(a[i]);

		}
		System.out.println("Student 2");
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(b[i]);

		}
	}
}