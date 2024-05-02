/*  find nth fibonacci number
import java.util.Scanner;
public class Assignment13 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("which fibonacci number you want to see? ");
      int n = input.nextInt();

     
    }
  }
}
*/


/* 
import java.util.Scanner;
public class Assignment13{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter your integer number:");
        int number=input.nextInt();

        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
      
       
        
       
        for(int i=3;i<=number;i++){
            int sum=first+second;
            first=second;
            second=sum;
            System.out.print(sum+" ");
        }

    }
}

*/





import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.print("Which fibonacci number you want to see : ");
        int n =x.nextInt();
        
        int first=0;
        int second=1;
        int fibo=0;
        
        if(n==1){
            System.out.println("Your "+n+"th fibonacci number is : "+first);
        }
        else if(n==2){
            System.out.println("Your "+n+"th fibonacci number is : "+second);
        }
        else{
            for(int i=3; i<=n; i=i+1){
                fibo=first+second;
                first=second;
                second=fibo;
            }
            System.out.println("Your "+n+"th fibonacci number is : "+fibo);
        }
     
    }
}