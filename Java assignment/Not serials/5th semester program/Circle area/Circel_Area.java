import java.util.Scanner;
public class Circel_Area{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your radius:");
        double radias=input.nextDouble();
        double area=3.1416*radias*radias;
        System.out.println("The circle area is :"+area);
    }
}