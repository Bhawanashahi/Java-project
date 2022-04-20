import java.util.Scanner;

public class Six{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length:");
        double l=scanner.nextDouble();
        System.out.println("enter breadth:");
        double b=scanner.nextDouble();
        double area=l*b;
        int castedarea=(int) (area);
        System.out.println(castedarea);
    }


}
