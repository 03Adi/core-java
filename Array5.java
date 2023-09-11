//copy all element of one array to another array
class copy_array
{
public static void main(String arg[])
{
int arr1[]=new int[]{1,2,3,4,5};
int arr2[]=new int[arr1.length];
for(int i=0;i<arr1.length;i++)
{
arr2[i]=arr1[i];
}
//disp element arr1
for (int i=0;i<arr2.length;i++)
{
System.out.println(arr2[i]+"");
}
}
}
