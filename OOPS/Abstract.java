
public class Abstract {
    public static void main(String[] args) {
        // Animals animals = new Animals(); // can't create object as it is abstract class

        
    }
}

abstract class Animals{
    void eat(){ //non-abstract method
        System.out.println("animmals eats .. ");

    }
    // abstract void walks(){ //error as it is abstract method
    //     System.out.println("walking");
    // }

    abstract void walks();//abstract method must be define in subclass
}

// class Horse extends Animals{ // show error  on horse bcoz it didn't defined abstract walk method as it inherits the abstract class

// }

class Horse extends Animals{
    void walks(){// abstract method of parent must defined in child class
        System.out.println("Animal and Horse walks..");
    }

    // abstract void runs(); // abstract methods or variables are can creates only in abstract class
    
}
