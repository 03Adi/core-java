//Third laggest no in an array
class largest_no
{
static int getlargest(int a[],int total)
{
int temp;
for(int i=1;i<total;i++)
{
for(int j=i+1; j<total;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a[0];
}
public static void main(String arg[])
{
int a[]={1,2,3,5,6,3,2};
System.out.println("largest:"+getlargest(a,7));
}
}
