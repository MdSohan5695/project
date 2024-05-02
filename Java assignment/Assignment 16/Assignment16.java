/*
 // validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"
 */

import java.util.Scanner;
public class Assignment16{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        String namet="sohan",passwordt="123";
        System.out.print("User name:");
        String name=x.nextLine();
        System.out.print("Password:");
       String  password=x.nextLine();

        if(name.equals(namet) && password.equals(passwordt)){
            System.out.println("Wellcome.");
        }
        else{
            System.out.println("Sorry");
        }

    }
}


