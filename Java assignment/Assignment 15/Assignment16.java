/*
 // 1. generate and print armstrong numbers from m-n 
// 2. count and print number of armstrong numbers
import java.util.Scanner;
public class Assignment15 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalArmstrongNumber=0;

    
     System.out.println("Total armstrong numbers : "+totalArmstrongNumber);
    }
  }
}
 */

import java.util.Scanner;
public class Assignment16{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.print("please enter your number:");
        int input=x.nextInt();
        int number=input,sum=0;

        while(number !=0){
            int remainder=number%10;
            sum=sum+remainder*remainder*remainder;
            number=number/10;
        }

        System.out.println(" ");
        if(sum==input){
            System.out.println(input+" is an Armstorg number.");
        }
        else{
            System.out.println(input+" is not an Armstorg number.");

        }
        
        
       
      
    }
}