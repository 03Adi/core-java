class mat_Add
{
public static void main(String arg[])
{
int arr1[][]={{1,3,4},{2,4,3},{3,4,5}};
int arr2[][]={{1,3,4},{2,4,3},{1,2,4}};
int sum[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
sum[i][j]=arr1[i][j]+arr2[i][j];
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}