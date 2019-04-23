import java.util.Scanner;
class Marksheets
{
	public static void main(String args[])
	{
	int marksobtained;

	Scanner x=new Scanner(System.in);

	System.out.println("Enter your Obtained Marks");
	System.out.println("Enter your Obtained Marks");
	System.out.println("Enter your Obtained Marks");

	int a=x.nextInt();
	int b=x.nextInt();
	int c=x.nextInt();
	marksobtained=a+b+c;
	double percentage=(marksobtained*100)/300;
	System.out.println(percentage);

	if(percentage>=90)
	{
    System.out.println("A");
	}
	else if(percentage<=90 && percentage>=80)
	{
	System.out.println("B");
	}
	else if(percentage<=79 && percentage>=80)
	{
	System.out.println("C");
	}
	else if(percentage<=69 && percentage>=60)
	{
	System.out.println("D");
	}
	else
	{
	System.out.println("F");
	}


	}
}