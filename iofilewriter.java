//IO FILE WRITE

import java.io.*;
class file_writer
  {
    public static void main(String arg[])
    {
      try
        {
          FileWriter fw=new FileWriter("abc4.txt");
          fw.write("hello java");
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }
