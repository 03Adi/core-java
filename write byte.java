import java.io.*;
class Test
  {
    public static void main(String arg[])
    {
      try
        {
          FileOutputStream Fout=new FileOutPutStream("abc.txt");
          Sytring s="India is best logical person";
          byte b[]=s.getBytes();
          System.out.println("Sucess");
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }
        
