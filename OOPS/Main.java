



public class Main {
    public static void main(String[] args) {
        // Parent reference, Child object
        Parent obj = new Child(); //upcasting

        // Accessing methods through parent reference
        obj.display(); // Output: Child display method (dynamic binding)

        // obj.show(); // Compile-time error: Parent reference doesn't have a `show` method
    }
}

class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show method");
    }

    @Override
    void display() {
        System.out.println("Child display method (overridden)");
    }
}
