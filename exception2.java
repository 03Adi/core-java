//unchecked excption
//ArthmeticException
//IndexOutOfBoundException
class excption
  {
    public static void main(String arg[])
    {
      try
        {
          int x=10/2;
          int z[]=new int[10];
          z[100]=1000;
        }
      catch(ArthmeticException e)
        {
          System.out.println(e);
        }
      catch(Array IndexOutOfBoundException e)
        {
          System.out.println(e);
        }
    }

  }
