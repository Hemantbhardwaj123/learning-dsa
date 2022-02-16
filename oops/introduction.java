// package oops;

// import java.util.*;
// import java.util.jar.Attributes.Name;

// public class introduction {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//      persion p1=new persion();
//     p1.age=12;
//     p1.name="Hemant";

//     persion p2= new persion();

//     p2.name="varun";
//     p2.age=21;
//     // System.out.println(p1.age +""+ p1.name);
//     // System.out.println(p2.age +""+p2.name);
//     // p1.walk();
//     // p2.eat();
//     p1.walk(5);
//     System.out.println(persion.count);
//     developer d1= new developer(24,"hemant");
//     d1.walk();
//    } 
// }
//    class developer extends persion{
//        public developer(int age,String name){
//        super(age,name);
//        }
//        void walk(){
//         System.out.println( "developer" +name +"is walking");
//         }
//    }

// class persion{
//     String name;
//     int age ;
//     static int count;
//     public persion(){
//         count++;
//         System.out.println(" creating an object");
//     }
//     //  constructor overloading= when a function uses another function properties
//     //   by using this keyword 
//     public persion( int age, String name){
//         this();
//         this.name=name;
//         this.age=age;
//     }
// // polimorphism is the method in which same funtion can be called by diffrentiating
// //     its propties

// void walk(){
//     System.out.println(name +"is walking");
//     }
//     void eat(){
//         System.out.println( name +" is eating");
//     }
//     void walk(int steps){
//         System.out.println(name +"walked"+ steps +"steps");
//     }
// }
package oops;

public class introduction {
    public static void main(String[] args) {

        Student hemant = new Student();
        Student rahul=new Student(15,"rahul bhardwaj",87.3f);
        // hemant.rollno=21;
        // hemant.name="hemant bhardwaj";
        //  hemant.marks=70.8f;
        // System.out.println(rahul.rollno);
        // System.out.println(rahul.name);
        // System.out.println(rahul.marks);
        // rahul.greeting();
        // rahul.changename)()
        Student random=new Student(hemant);
        System.out.println(random.name);

        Student one = new Student();
        Student two=one;

        one.name="something ";
        System.out.println(two.name);
    }
}

class Student {
    int rollno;
    String name;
    float marks =77.8f;

    void greeting() {
        System.out.println("hello! my name is" +name);
    }
    void changename(String name){
        this.name=name;
    }
    Student(Student other){
        this.name=other.name;
        this.rollno=other.rollno;
        this.marks=other.marks;
    }
    Student (){
        this.rollno=21;
        this.name="hemant bhardwaj";
        this.marks=70.8f;
    }
    Student(int rolno, String name,float marks){
        this.rollno=rolno;
        this.name=name;
        this.marks=marks; 
    }
}
