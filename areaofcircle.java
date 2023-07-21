import java.util.Scanner;
public class areaofcirculewithinput{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
            int redius = sc.nextInt();
            double pi = 3.1415;
            double area = pi * redius * redius;
            System.out.println("The area of circule is:" +area);
            sc.close();
         
        }
    }
