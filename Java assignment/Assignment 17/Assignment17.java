// Create a pattern like following one if n=4
/*
 1
 1 0
 1 0 1
 1 0 1 0
 */
import java.util.Scanner;
public class Assignment17{
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your row number:");
        int n=input.nextInt();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col%2);

                }
                System.out.println();
            }
        }
    }
