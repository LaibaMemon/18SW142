import java.util.Scanner;

 class Calculator
 {
   public static void main(String args[])
   {
   	 char ch ;
    Scanner input=new Scanner(System.in);
    String t=args[0];
    String y=args[1];
    // String z=args[2];

    int a=Integer.parseInt(t);
    int b=Integer.parseInt(y);
    System.out.println("Enter the operation * + - / %");
    ch=input.next().charAt(0);



    if(ch=='+')
    {

       System.out.println("Addition"+(a+b));
    }
     if(ch=='-')
    {
       System.out.println("Subtraction"+(a-b));
    }
     if(ch=='*')
    {
       System.out.println("Multiplication"+(a*b));
    }
     if(ch=='/')
    {
       System.out.println("Division"+(a/b));
    }

   }
 }