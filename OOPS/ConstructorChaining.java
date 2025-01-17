class Parent {
    Parent() {
        System.out.println("Parent no-argument constructor");
    }

    Parent(String msg) {
        System.out.println("Parent constructor with message: " + msg);
    }
}

class Child extends Parent {
    Child() {
        this("Child constructor message");
        System.out.println("Child no-argument constructor");
    }

    Child(String msg) {
        super("Parent called from child");
        System.out.println("Child constructor with message: " + msg);
    }
}


class Example {
    Example() {
        this("Hello");
        System.out.println("No-argument constructor");
    }

    Example(String msg) {
        this(42);
        System.out.println("Single-argument constructor: " + msg);
    }

    Example(int num) {
        System.out.println("Single-argument constructor with int: " + num);
    }
}




public class ConstructorChaining {
    public static void main(String[] args) {
        Child obj = new Child();
        // Output:
        // Parent constructor with message: Parent called from child
        // Child constructor with message: Child constructor message
        // Child no-argument constructor

        Example obj2 = new Example();
        // Output:
        // Single-argument constructor with int: 42
        // Single-argument constructor: Hello
        // No-argument constructor
    }
}
