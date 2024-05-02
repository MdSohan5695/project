


import java.util.Scanner;
 public class practice{
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        System.out.print("start:");

        int start=input.nextInt();
        System.out.print("end:");
        int end=input.nextInt();
       int sum = 0;

        for(int i = start; i <= end; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    
           

     
     
    
    }
}