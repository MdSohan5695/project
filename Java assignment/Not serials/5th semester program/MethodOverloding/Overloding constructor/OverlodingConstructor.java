public class OverlodingConstructor{
    public static void main(String[]args){
        Teacher teacher1=new Teacher();

        Teacher teacher2=new Teacher("Anis","male");
        teacher2.display();

        Teacher teacher3=new Teacher("Aminul","male",1555);
        teacher3.display();


    }
}
    public class Teacher{
        String name,gender;
        int phone;

        Teacher(){
            System.out.println("No information.");
        }

        Teacher(String n,String g){
            name=n;
            gender=g;
            
        }

        Teacher(String n,String g,int p){
            name=n;
            gender=g;
            phone=p;
            
        }

        void display(){
            System.out.println("Name:"+name);
            System.out.println("Gender:"+gender);
            System.out.println("Phone:"+phone);
        }


    }






/* 
public class OverlodingConstructor {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Anis", "male");
        teacher2.display();

        Teacher teacher3 = new Teacher("Anis", "male", 1555);
        teacher3.display();
    }
}

class Teacher {
    String name, gender;
    int phone;

    Teacher() {
        System.out.println("কোনো তথ্য নেই।");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    void display() {
        System.out.println("নাম: " + name);
        System.out.println("লিঙ্গ: " + gender);
        System.out.println("ফোন: " + phone);
    }
}
*/