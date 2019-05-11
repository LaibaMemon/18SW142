class Author
{
	private String name;
	private String email;
	private char gender;


	public Author(String n,String e,char g)
	{
	   name=n;
	   email=e;
	   gender=g;
	}
	public String getName()
	{
	    return name;
	}
	public void setEmail(String e)
	{
	   email=e;
	}
	public String getEmail()
	{
	   return email;
	}
	public char getGender()
	{
	  return gender;
	}
	public String toString()
	{
      return "Author[name="+name+",email="+email+"gender="+gender+"]";
	}
}
class Author1
{
	public static void main(String args[])
	{
	    Author a=new Author("laiba","laibamemon94@gmail",'f');


	    System.out.println(a.getName());
	    System.out.println(a.getEmail());
	    System.out.println(a.getGender());
	    System.out.println(a.toString());
	}
}