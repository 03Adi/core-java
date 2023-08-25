import java.io.*;
class test
  {
    public static void main(String arg[])throws exception
    {
      FileOutputStream fout1=new FileOutputStream("abc.txt");
      FileOutputStream fout2=new FileOutputStream("abc2.txt");
      ByteArrayOutputStream bout=new ByteArrayOutputStream();
      bout.write(100);//means that d
      bout.writeTo(fout1);
      bout.writeTo(fout2);
      bout.flush();
      System.out.println("sucess...");
    }
  }
