/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */
import java.util.Scanner;
class product{
	public static void main(String[]args){
		int id,price;
		String title,description,category;

		Scanner input1=new Scanner(System.in);
		System.out.print("id:");
		id=input1.nextInt();
		System.out.print("price:");
		price=input1.nextInt();

      


		Scanner input2=new Scanner(System.in);
		System.out.print("title:");
		title =input2.nextLine();
		System.out.print("descriction:");
		description=input2.nextLine();
		System.out.print("category:");
		category=input2.nextLine();


        System.out.println("  ");
	    System.out.println("  ");
		System.out.println("Your id is:"+id);
		System.out.println("price is:"+price);

        System.out.println("The title is:"+title);
		System.out.println("Description is:"+description);
		System.out.println("Category name is:"+category);
	
		}

}