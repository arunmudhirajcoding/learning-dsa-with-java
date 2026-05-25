
public class Overriding {
    public static void main(String[] args) {

    }
}
class Animals{
    void eats(){
        System.out.println("eats all..");

    }
    // void eats(){ // creat as it override also it is in same class
    //     System.out.println("eats some..");
    // }
}
class Dogs extends Animals{
    void eats(){//overrided due its inheritance but it is in different class 
        System.out.println("eats some..");
    }
}
