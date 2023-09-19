//main diffrence between method Hiding and overloading is--
//method hiding -- compiler based on refrence
//method overloading -- JVM runtime object
class p
  {
    public static void m1()
    {
      System.out.println("parent");
    }
  }
class c extends p
{
  public static void m1()
  {
    System.out.prinln("child");
  }
}
class Test
  {
    public static void main(String arg[])
    {
      p P=new p();//parent
      P.m1();
      c C=new c();//child
      C.m1();
      p P1=new p();//based on refrence because of static method so print parent
      P1.m1();
    }
  }
