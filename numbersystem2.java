//Decimal To Binary

import java.util.Scanner;
class decimalTobinary
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int decimal_num = sc.nextInt();
int ans = 0;

int pw = 1;

while(decimal_num>0)
{
int parity = decimal_num % 2;
ans +=(parity*pw);
pw*=10;
decimal_num /=2;
}
System.out.println(ans);
}
}
