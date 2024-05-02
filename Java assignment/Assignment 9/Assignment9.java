// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
import java.util.Scanner;
public class Assignment9{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("please select your option in the Integer value:");
        int option=input.nextInt();

        switch(option){
            case 1:
            System.out.println("You selected bengali language.");
            break;
            case 2:
            System.out.println("You selected hindi language.");
            break;
            case 3:
            System.out.println("You selected urdu language.");
            break;
            default:
            System.out.println("You selected english language.");

        }

    }

}
