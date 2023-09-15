//Method name same but argument type are diffrent in method signature
class test
  {
    public void m1(int x)
    {
    }
    public void m2(String s)
    {
    }
  public static void  main(String arg[])
    {
      test t=new test();
      t.m1(0);
      t,m2("Aditya");
    }
  }
