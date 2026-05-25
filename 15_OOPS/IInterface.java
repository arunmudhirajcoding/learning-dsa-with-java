public class IInterface {
    public static void main(String[] args) {
        // Arun a = new Arun(); // cant instantiate
        ArunChild Ac = new ArunChild();
        Ac.run();
        // System.out.println();

    }
}

interface Arun {
    // in this varibales or methods should be pubic or static or final in child class 
    void run();// no implementation pure abstraction
}
interface Tharun {
    void fastRunner();
}

class ArunChild implements Arun, Tharun {
    public void fastRunner(){
        System.out.println("fast runer.. ");
    }
    public void run() {
        System.out.println("running ... ");
    }
}
