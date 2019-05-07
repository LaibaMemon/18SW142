class Combination
{
	 Combination(Student s, Marksheet m)
	 {
 

	 }

	 public void CreateStudentResult(Student s, Marksheet m)
	 {
         s.setdata("Laiba" , "Software" ,  142);
         s.Showdata();
         m.Setmarks(30,20,40);
         m.TotalMarks();

	   }
}	   


	 public static void main(String args[])
	 { 
	   Student s=new Student();
	   Marksheet m=new Marksheet();


	   Combination c=new Combination(s,m);
	   c.CreateStudentResult(s,m);

	 }
