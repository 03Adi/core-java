interface my
{
void show();
}
class child
{
public static void main(String arg[])
{
int x=10;
my m = new my()
{
public void show()
{
System.out.println("message"+x);
}
};
m.show();
}
}
