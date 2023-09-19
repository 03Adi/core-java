class p
  {
    int x=888;
  }
class c extends p
  {
    int x=999;
  }
class Test
  {
    public static void main(String arg[])
    {
      p P=new p();
      System.out.println(P.x);
      c C=new c();
      System.out.println(C.x);
      p p1=new p();
      System.out.println(p1.x);
    }
  }
