class SumOfMatrices
{
	public static void main(String args[])
	{
      int [][]m1={{1,2,3},{4,5,6},{7,8,9}};
      int [][]m2={{2,2,3},{2,5,4},{2,4,1}};

      int [][]m3=new int[3][3];

      for(int i=0;i<m1.length;i++)
      {
        for(int j=0;j<m1[i].length;j++)
        {
           m3[i][j]=m1[i][j]+m2[i][j];
           System.out.println(m3[i][j]+"  ");

           


        }
        System.out.println();
      }


      	}
}