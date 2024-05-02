
class Student{
    String name="SOHAN";
    int roll=676972,result=3;
}

class Information extends Student{
    void display(){
        System.out.println("Student name is:"+name);
        System.out.println("Student roll is:"+roll);
        System.out.println("Student result is:"+result);
    }

}


public class Single_Inheritance{
    public static void main(String[]args){
        Information obj=new Information();
        obj.display();

    }
}
