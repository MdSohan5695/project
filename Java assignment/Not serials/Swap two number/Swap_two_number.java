public class Swap_two_number{
    public static void main(String[]args){
        int a=5,b=6;

        //Before swap

        System.out.println("Before swap:");

        System.out.println("a= "+a);
        System.out.println("b= "+b);


        //After swap

        System.out.println("After wap:");

       a=a-b;
       b=a+b;
       a=b-a;
       
       System.out.println("a= "+a);
       System.out.println("b= "+b);


    }
}