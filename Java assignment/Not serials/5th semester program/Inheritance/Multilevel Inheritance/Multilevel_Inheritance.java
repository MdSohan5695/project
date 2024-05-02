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

class Add_Information extends Information{

    String address="Bangladesh/Mymensing/Jamalpur/Melandah.";
    void Add_display(){
        display();
        System.out.println("Student address is:"+address);

    }
   
  

}


public class Multilevel_Inheritance{
    public static void main(String[]args){
        Add_Information obj=new Add_Information();
        obj.Add_display();

    }
}

