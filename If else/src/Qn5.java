//Write a JAVA program to check whether a number is even or odd.
import java.util.Scanner;


    public class Qn5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num1 = input.nextInt();
            if (num1%2==0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }

