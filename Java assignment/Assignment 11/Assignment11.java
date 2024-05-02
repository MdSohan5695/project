// find factorial of n

/* 
import java.util.Scanner;
public class Assignment11{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your integer value:");
        int Number=input.nextInt();
        int Factorial=FactorialValue(Number);
        System.out.println("The fatorial value is: "+Factorial);

    }
    public static int FactorialValue(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;

        }
        return factorial;
    }
}
*/

import java.util.Scanner;
public class Assignment11{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your integer number:");
        int number=input.nextInt();
        int variable_for_factorial=factorial_method(number);
        System.out.println("This integer number factorial value is:"+variable_for_factorial);

    }

    public static int factorial_method(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
