//If parent class method is static
class p
  {
    public static void m1()
    {
    }
  }
class c extends p
  {
    public void m1()
    {
    }
  }
//compile time error because of overidden method is static
