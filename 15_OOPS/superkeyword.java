public class superkeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walking();
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor is called..");

    }
    String color;
    void walking(){
        System.out.println(" walking in animal..");
    }
}
class Horse extends Animal{
    // super();// constructor using super keyword is called inside a method only not outside of the method
    // super.color="brown"; // this is not allowed because super is used to call the parent class constructor
    Horse(){
        super();
        System.out.println("Horse class constructor is called");
    }
    
    void walking(){
        System.out.println(" walking in Horse..");
        super.walking();
    }
    
    void hi(){
        // super(); //Constructor call must be the first statement in a constructor
        System.out.println("hi...");
    }
}


