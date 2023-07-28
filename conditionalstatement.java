import java.util*Scanner;
public class evenodd
{
  public static void main(String arg[])
  try(Scanner sc = new Scanner(System.in))
  {
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(n%2==0)
    {
      System.out.println("The no is even");
    }
    if(n%2!=0)
    {
      System.out.println("The no is odd");
    }
  }
}
  
