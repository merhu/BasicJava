import java.util.Scanner;
public class SwitchStmnt {
    public static void main(String[] args) {
        //This program will print 'May' when you run it.
        Scanner sc = new Scanner(System.in);

        int month ;
        System.out.println(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
        month = sc.nextInt();



            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("\n 31 Days in this Month");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("\n 30 Days in this Month");
                    break;

                case 2:
                    System.out.println("\n Either 28 or 29 Days in this Month");
                    break;

                default:
                    System.out.println("\n Please enter Valid Number between 1 to 12");
            }
        }
    }
