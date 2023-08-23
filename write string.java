import java.io.*;
class Test
  {
    public static void main(String arg[])
    {
      try
        {
          fileInputStream fin=new FileInputStream("abc.txt");
          int i=0;
          while(i=fin.read())!=-1)
            {
            System.out.println(i);//get byte code
            //System.out.println(char()i); get char data store in file
          }
        }
      catch(Exception e)
        {
          System.out.println(e)
            }
    }
  }
          
