

 import java.util.Scanner;
 public class Sum_of_digit{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);

        System.out.print("please enter your number:");
        int input=x.nextInt();


        int number=input;
        int sum=0;
        while(number !=0){
            int remainder=number%10;
            sum=sum+remainder;
            number=number/10;
        }
        System.out.println(sum);
        

      
        
    }
 }

 

 





