
// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview
import java.util.Scanner;
public class Assignment8{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);

       
        System.out.print("Have you completed your master ?:(Y,y/N,n=)");
        char education=input.next().charAt(0);
         
        System.out.print("Are you fulent in English ?:(Y,y/N,n)=");
        char languageSkill=input.next().charAt(0);

        if((education=='y'||education=='Y')&&(languageSkill=='y'||languageSkill=='Y')){
            System.out.println(" Congratulation! You are eligible to for the job.");
        }
        else if((education=='n'||education=='N')&&(languageSkill=='n'||languageSkill=='N')){
            System.out.println(" Sorry, You are eligible to for the job interview.");
        }
        else{
            System.out.println("Your answer is invalid.Try to next time.");
        }

    }
}