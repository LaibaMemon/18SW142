class StarPattern1
{
	public static void main(String args[])
	{
	// char matrix[][]={{'*'},{'*','*'},{'*','*','*'}}
		char matrix[][]= new char[][]{new char []{'*'} , new  char[]{'*', '*'} , new char[]{'*' , '*' , '*'} , new char[]{'*','*','*','*'} , new char[]{'*','*','*','*','*'}};
	 

	  for(int i=0;i<matrix.length;i++)
	{
	        for(int j=0;j<matrix[i].length;j++)
	  {

	         System.out.print(matrix[i][j]);
	  }
	         System.out.println();
	
	}
	
	}
}