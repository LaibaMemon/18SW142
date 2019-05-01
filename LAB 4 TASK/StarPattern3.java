class StarPattern3
{
	
	public static void main(String args[])
	{

     int x=1;
	 char matrix[][]= new char[][]{new char []{'*'} , new  char[]{'*', '*'} , new char[]{'*' , '*' , '*'} , new char[]{'*','*','*','*'} , new char[]{'*','*','*','*','*'},new char[] {'*','*','*','*','*','*'}};

	 for(int i=1;i<matrix.length;i++)

	 {

	 for(int j=matrix.length;j>matrix[i].length;j--)
	 {
	    System.out.print(" ");
	 }

	 for(int k=1;k<=x;k++)

	 {
	  System.out.print("*");
	}

	 
	 System.out.println(" ");
	 x+=2;
	}

	}
}