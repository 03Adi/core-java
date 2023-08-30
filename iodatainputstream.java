//IO DATA INPUT STREAM
import java.io.*;
class Data_input
{
public static void main(String arg[])throws Exception
{
FileInputStream f=new FileInputStream("abc5.txt");
DataInputStream di=new DataInputStream(f);
int count =di.available();
byte b[]=new byte[count];
di.read(b);
for (byte g : b)
{
char k = (char) g;
System.out.println(k);
}
}
}
