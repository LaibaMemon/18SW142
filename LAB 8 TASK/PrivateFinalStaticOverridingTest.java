class Base
    { 
    public final String version()
    {
      where();
      return "1.0.0";
    }
    public static String name()
    {
        return "Base"; 
    }
    private void where()
        {
        System.out.println("Inside Base Class");
        } 
} 
           
class Derived extends Base
{
    public static String name()
    {
        return "Derived"; 
    } 
    private void where()
    {
        System.out.println("Inside Derived Class"); 
    } 
}

class PrivateFinalStaticOverridingTest
{
    public static void main(String args[])
    {
      Base b = new Derived(); 
      System.out.println(b.version());
      System.out.println(b.name());
    } 
} 

           
         