//case 2nd
class Test
  {
    public void m1(int i)
    {
      System.out.println("int arg");
    }
    public void m1(float f)
    {
      System.out.println("float arg");
    }
    public static void main(String arg[])
    {
      Test t=new Test();
      t.m1(10);//int arg
      t.m1(10.5f);//float arg
      t.m1(10.5);//double arg but double>float in automatic promotion table so double type value provide a compile time error in float type argument
    }
  }
