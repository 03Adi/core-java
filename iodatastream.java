//IO DATASTREAM 
//MACHINE INDEPENDENT CLASS
//HIGH LEVEL STREAM

import java.io.*;
class data_output
{
public static void main(String arg[])throws Exception
{
FileOutputStream fi=new FileOutputStream("abc3.txt");
DataOutputStream data=new DataOutputStream(fi);
data.writeInt(100);
System.out.println("sucess----");
}
}
