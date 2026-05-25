
public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arun";
        s1.rollNo = 23641;
        s1.marks[0] = 90;
        Student s2 = new Student(s1); // copy constructor
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.marks[0]);
        s1.marks[0] = 100; // updated but it also updated in s2 as well
        s1.name = "tharun";// updated but doesn't updates in s2
        System.out.println(s2.marks[0]);
        // System.out.println(s2.name);//just copied so after changes. it won't update

    }
}

//class without public always written below the public class not above the public class
class Student{
    String name;
    int rollNo;
    int marks[];
    //shallow copy constructor
    // Student(Student s){
    //     marks = new int[3];
    //     name = s.name;
    //     rollNo = s.rollNo;
    //     this.marks= s.marks;//shallow copy means references is copied
    // }

    // deep copy constructor
    Student(Student s){
        marks = new int[3];
        //or by using loop on marks we can implement deep copy
        this.marks[0]= s.marks[0];//deep copy means new object is created, changes wont apears 
    }
    Student(){
        marks = new int[3];
        System.out.println("default non parameterized constructor is called...");
        
    }
}
