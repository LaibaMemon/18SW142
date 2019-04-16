class FifthBitwiseOperator
{
public static void main(String args[])
{
   int a=4;
   int b=5;
   int c= a & b;     //a     =0100   (4)   //AND OPERATOR
                     //b     =0101   (5)
                     //c=a&b =0100   =4


  int d= a | b;      //a     =0100   (4)   //OR OPERATOR
                     //b     =0101   (5)
                     //d=a|b =0101   =5

  int e= a ^ b;      //a     =0100   (4)   //EX OR OPERATOR
                     //b     =0101   (5)
                     //e=a^b =0001   =1 

  int f= ~a;         //NOT OPERATOR  =-5


     int g=10;      //00001010
     int h=g>>2;    //=00000010 =2             //RIGHT SHIFT OPERATOR



     int i=g<<2;    //=00101000 =40             //LEFT SHIFT OPERATOR
  System.out.println("And Operator Result:"+c);
  System.out.println("Or Operator Result:"+d);
  System.out.println("EX OR Operator Result:"+e);
  System.out.println("NOT Operator Result:"+f);
  System.out.println("RIGHT SHIFT Operator:"+h);
  System.out.println("LEFT SHIFT Operator:"+i);
}
}
