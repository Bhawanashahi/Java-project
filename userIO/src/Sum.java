import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number");
        float a= scanner.nextFloat();
        System.out.println("Enter second number");
        float b= scanner.nextFloat();
        System.out.println("Enter third number");
        float c= scanner.nextFloat();
        System.out.println("Enter fourth number");
        float d= scanner.nextFloat();
        System.out.println( "Sum of numbers" +(a+b+c+d));
    }
}
