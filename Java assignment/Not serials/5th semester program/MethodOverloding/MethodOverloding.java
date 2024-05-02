public class MethodOverloding{
    public static void main(String[]args){

        AnotherClass Object=new AnotherClass();
        Object.number(2,3);
        Object.number(5,5,5);
           
    }
}


class AnotherClass{
    int number(int a, int b){
        int sum=a+b;
        System.out.println("Two integer value sum is:"+sum);
        return 0;


    }
    
    int number(int a,int b, int c){
        int sum=a+b+c;
        System.out.println("Three integer value sum is: "+sum);
        return 0;

    }

}