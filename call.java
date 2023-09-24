class test
{
static int i=10;
static 
{
m1();
System.out.println(i);
}
public static void main(String[] args)
{
System.out.println(i);
}
static void m1()
{
i=20;
}
}
