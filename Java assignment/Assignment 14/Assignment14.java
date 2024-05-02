
/*
 // 1. generate and print palindrome numbers from m-n 
// 2. count and print number of palindrome numbers
import java.util.Scanner;
public class Assignment14 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalPalindromeNumber=0;

    
     System.out.println("Total Palindrome numbers : "+totalPalindromeNumber);
    }
  }
}
 */

 
import java.util.Scanner;
public class Assignment14{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your number:");
        int x=input.nextInt();
        int number=x,each_digit,sum=0;
        while(number !=0){
            each_digit=number%10;
            sum=sum*10 +each_digit;
            number=number/10;
            
        }
   
      if(sum==x){
        System.out.println(x+" is a palliandom number");
      }
      else{
        System.out.println(x+" is not a palliandom number");
      
      }


        
        

        
    }
} 

