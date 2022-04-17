import java.util.Scanner;

public class hw5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String a=scanner.nextLine();
        System.out.println("Enter your age");
        int b= scanner.nextInt();
        System.out.println("Enter your country");
        String c= scanner.nextLine();
        System.out.println("My name is" +a+ "/n" +b+ "/n" +c+ "/n");

    }
}
