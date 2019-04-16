class SecondLogicalOperator
{
public static void main(String args[])
{
  int a=20;  int x=30;
  int b=10;  int y=40;
  boolean c= a<x && b<y;
  boolean d= a>x && b>y;
  boolean e= a<x || b<y;
  boolean f= a>x || b>y;
  boolean g =!(a<x);
 
System.out.println("Result:"+c);
System.out.println("Result:"+d);
System.out.println("Result:"+e);
System.out.println("Result:"+f);
System.out.println("Result:"+g);
}
}




 