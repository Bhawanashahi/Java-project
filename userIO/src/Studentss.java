import java.util.Scanner;

public class Studentss {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter marks of 1st subject");
        double a=scanner.nextDouble();
        System.out.println("Enter marks of 2nd subject");
        double b=scanner.nextDouble();
        System.out.println("Enter marks of 3rd subject");
        double c=scanner.nextDouble();
        System.out.println("Enter marks of 4th subject");
        double d=scanner.nextDouble();
        double marks;
        String grade;
        System.out.println(marks=(a+b+c+d)/4);
        grade=(marks>=70)?"first class":
                (marks>59& marks<70)?"upper second class":
                (marks>49 & marks<59)?"second class":
                (marks>39 & marks<49)?"Third class":
                 "fail";
        System.out.println(grade);

    }
}
