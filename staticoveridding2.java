//child class method is static
class p
  {
    public void m1()
    {
    }
  }
class c extends p
  {
    public static void m1()
    {
    }
  }
//compile time error because of overridding method is static
