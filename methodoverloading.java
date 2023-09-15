//In method overloading same method name are allowed but requaired diffrent argument type
//In overloading refrence value are mainly required
class Test
  {
    public void m1()
    {
      System.out.println("no arg");
    }
    public void m1(int i)
    {
      System.out.println("int arg");
    }
    public void ma1(double d)
    {
      System.out.println("double arg");
    }
    public static void main(String arg[])
    {
      Test t=new Test();
      t.m1();
      t.m1(i);
      t.m1(d);
    }
  }
