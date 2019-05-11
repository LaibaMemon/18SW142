class Student
{
	private int rollno;
	private String name;


	public Student(int rollno, String name)
	{
	    this.name=name;
	    this.rollno=rollno;
	}
	public void setname(String name)
	{
	    this.name=name;
	}
    public String getname()
    {
        return name;
    }

   public void setrollno(int rollno)
   {
       this.rollno=rollno;
   }

   public int getrollno()
   {
      return rollno;
   }
   public void usearray(Student[] std)
   {
      std[0].setname("Laiba");
   }
}
 
class UseStudent
{
	public static void main(String args[])
	{
	   Student s1=new Student(142, "laiba");
	   Student s2=new Student(32, "Aemon");
	   Student s3=new Student(34, "nitalia");

	   Student[] students={s1,s2,s3};
	   System.out.println(students[0].getname());
	}
}