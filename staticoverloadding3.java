//when both parent and child class method have static method
class p
  {
    public static void m1()
    {
    }
  }
class c extends p
  {
    public static void m1()
    {
    }
  }
//overall this method is called method Hiding not a method overloading
