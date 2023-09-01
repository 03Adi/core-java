//switch case

import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuseday");
                break;

            case 3:
                System.out.println("Wedneshday");
                break;

            case 4:
                System.out.println("Thurseday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Invaild day number");
        }

    }

}
