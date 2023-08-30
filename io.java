//I/O Pointstream class

import java.io.*;
class pointstream_demo
{
public static void main(String arg[])throws Exception
{
FileOutputStream fout=new FileOutputStream("abc.txt");
PrintStream put=new PrintStream(fout);
put.println("Hello java");
put.println("java is programming language");
}
}
