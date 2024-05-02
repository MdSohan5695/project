
/*
 import java.util.Scanner;
// Create a program to calculate installment amount for per month
public class Assignment4 {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int phonePrice = 1800; // 1800 euros
      int numberOfInstallment, installmentPerMonth;

      System.out.print("Number of installments? ");
      // get number of installments from user
     

      // calculate  installment amount for per month
    

        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
    } 

  }
}
 */
import java.util.Scanner;


class Assignment4{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        double phonePrice=1800;
        double numberOfInstallment; double InstallmentPerMonth;
        System.out.print("Number of Installment:");
        numberOfInstallment=input.nextInt();
        InstallmentPerMonth=phonePrice/numberOfInstallment;
        System.out.println("Monthly installment Amount:"+InstallmentPerMonth+" euros");
    }
  

}



