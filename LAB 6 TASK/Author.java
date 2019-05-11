class Book
{
	private String name;
	private Author authors[];
	private double price;
	private int quantity=0;

	Book(String name , Author[] authors , double price )
	{
	  this.name=name;
	  this.authors=authors;
	  this.price=price;
	}

	Book(String name,  Author[] authors, double price , int quantity )
	{
	  this.name=name;
	  this.authors=authors;
	  this.price=price;
	  this.quantity=quantity;
	}


	public String getName()
	{
	  return name;
	}

	public double getPrice()
	{
	   return  price;
	}

	public void SetPrice(double  p)
	{
	   price=p;
	}
	public void SetQuan(int q)
	{
        quantity=q;
	}
	public double getQuan()
	{   
	  return    quantity;
	}
	public String toString()
	{
		String authorlist="";
		for(int i=0;i<authors.length;i++)
		{
			authorlist+=authors[i].toString()+",";
		}
	         
	         return "MainBook[name="+name+",Authors="+authorlist+ "price="+price+"quantity="+quantity+"]";
	}


}
class Author
{
	public static void main(String [] args)
	{
		Author a1=new Author("Lafore");
		Book a2=new MainBook("Robbert lafore");
		Author[] authors={a1,a2};
	    Book b1=new Book("Robbert lafore" ,authors, 998 , 10);
	    String a=b1.getName();
	    b1.SetPrice(87);
	    double b=b1.getPrice();
	    b1.SetQuan(10);
	    double d=b1.getQuan();
	    Author[] k=b1.getauthor();
	    System.out.println(k);
}
}