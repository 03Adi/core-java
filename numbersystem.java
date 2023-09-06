import java.util.Scanner;
class binaryTodecimal
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int binary_num = sc.nextInt();

int ans = 0;//converted decimal number
int adi = 1;//2^0=1 power of 2

while(binary_num>0)
{
int unit_digit = binary_num%10;
ans += (unit_digit * adi);
binary_num /= 10;
adi *=2;
}
System.out.println(ans);
}
}
