import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your name");
        String a= scanner.nextLine();
        System.out.println("Enter Student Id");
        int b= scanner.nextInt();
        System.out.println("Enter your age");
        int c= scanner.nextInt();
        System.out.println("Enter a subject");
        String d= scanner.nextLine();
        System.out.println( a + "/n" +b+"/n"+c+"/n" +d+"/n");

    }
}
