
import java.util.Scanner;
public class TraingleArea{
    public static void main(String[]args){
        double a=5,b=6,c=7;

        if((a+b)>c &&(b+c)>a &&(c+a)>b){
            double s=(a+b+c)/2; //semi_perimeter 
            double area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
            System.out.println("Traingle area is:"+area);

        }

        else{
            System.out.println("Traingle area is not possible.");
        }
       

    }
}