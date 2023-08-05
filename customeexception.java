class InvalidAge extends Exception
{
 InvalidAge(String str)
{
 super(str);
}
}
class Test
{
 static void validate(int age)throws InvalidAge
{ 
 if(age<18)
{
 throw new InvalidAge("Age is not valid to vote");
}
else
{
System.out.println("welcome to vote");
}}
public static void main(String arg[])
{
try
{
 validate(10);
}
catch(InvalidAge r)
{
 System.out.println(r);
}
}
} 
