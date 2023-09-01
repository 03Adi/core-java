import java.util.Scanner;
public class ternaryoperator
  {
    public static void main(String arg[])
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

    String ans;
      ans = (num%2==0) ? "even" : "odd";
      System.out.println(ans);
    }
  }
// mainly ternary operator are remove lines of code(make small program)
//mainly reduce if else statements
