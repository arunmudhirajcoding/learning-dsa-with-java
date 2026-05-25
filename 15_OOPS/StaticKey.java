public class StaticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s2.setName("gghs");
        System.out.println(s1.schoolName);//prints gghs in all obj
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);

        System.out.println(Student.schoolName);// static methods or varibles can call by its class name without obj creation
        
    }
}

class Student{
    int rollNo;
    String name;
    static String schoolName;
    void setName(String Sname){
        this.schoolName = Sname;
    }
}
