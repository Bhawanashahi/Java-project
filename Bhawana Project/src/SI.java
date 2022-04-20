import java.util.Scanner;

public class SI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principle:");
        double P= scanner.nextDouble();
        System.out.println("enter time:");
        double T= scanner.nextDouble();
        System.out.println("enter rate:");
        double R= scanner.nextDouble();
        double SI= P*T*R/100;
        int castedSI= (int) (SI);

    }
}
