//Remove duplicate array from an array
//When array already in sort form

class Remove_Test
{
public static int remove_duplicate(int arr[],int n)
{
if(n==0||n==1)
{
return n;
}
int temp[]=new int[n];
int j=0;
for(int i=0;i<n-1;i++)
{
if(arr[i]!=arr[i+1])
{
temp[j++]=arr[i];
}
}
temp[j++]=arr[n-1];
//changing original array
for(int i=0;i<j;i++)
{
arr[i]=temp[i];
}
return j;
}
public static void main(String arg[])
{
int arr[]={10,20,20,30,30,40,50,50};
int length=arr.length;
length=remove_duplicate(arr,length);
for(int i=0;i<length;i++)
{
System.out.println(arr[i]+"");
}
}
}
