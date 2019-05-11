class Overload
{
    public void setName(int a,char b)
    {
        System.out.println("The integer is= "+a+  "the char is=" +b);
    }	
    public void setName(char a,int b)
    {
        System.out.println("The character is= "+a+  "the integer is=" +b);
    }
} 
class UseInteger
{
	public static void main(String args[])
	{
	    Overload t=new Overload();
	    t.setName(10,'A');
	    t.setName('B',20);
	}
}