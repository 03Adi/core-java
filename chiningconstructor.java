class Test
  {
    test()
    {
      this(10);
      System.out.println("def cons call");
    }
    test(int x)
    {
      this(10,20);
      System.out.println(x);
    }
    test(int x,int y)
    {
      System.out.println(x+y);
    }
    public static void main(String[] arg)
    {
      new test();
    }
  }
