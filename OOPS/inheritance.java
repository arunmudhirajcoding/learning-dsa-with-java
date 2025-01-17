
public class inheritance {
    public static void main(String[] args) {
        Tuna tu = new Tuna();
        Shark sh = new Shark();
        Peacock pk = new Peacock();
        Dog dg = new Dog();
        Cat c = new Cat();
        Human man = new Human();
        Animals A = new Reptiles();
        A.eats();
        // A.getName();
        
        
    }
}

class Animals{
    void eats(){
        System.out.println("eating..");
    }
    void breaths(){
        System.out.println("Breathing..");
    }
}
class Fish extends Animals{
    int fins = 4;
    String grills = "both sides";
    
}
class Tuna extends Fish{
    String light = "light on head";
} 
class Shark extends Fish{
    int horn = 1;
} 
class Bird extends Animals{
    int wings = 2;
}
class Peacock extends Bird{
    String dance = "it can dance..";
}

class Mammals extends Animals{
    String birth = "Give birth directly";
}
class Dog extends Mammals{
    String barks = "Dogs braks";
}

class Cat extends Mammals{
    String scratch = "it scratches every day";
}
class Human extends Mammals{
    String walk = "can walk with 2 legs";
}

class Reptiles extends Animals{
    void getName(){
        System.out.println("reptiles....");
    }
    void eats(){
        System.out.println("eating..");
    } 
}
