//find given integer value to ASCII value

import  java.io.*;
class Test
  {
    public static void main(String[] arg)throws Exception
    {
      byte by[]={35,36,37,38};
      ByteArrayInputStream b=new ByteArrayInputStream(by);
      int k=0;
      while((k=b.read())!=-1)
        {
          char ch=(char)k;
          System.out.println("ASCII value of character is:"+k+";Special character is:"+ch);
        }
    }
  }
