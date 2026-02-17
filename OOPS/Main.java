



public class Main {

    public static int sum (int a, int b){//overloading
        return a+b;
    }
    public static int sum(int a, int b, int c){//overloading with no. of params
        return a+b+c;
    }
    public static float sum(float a, float b){//overloading with params dt
        return a+b;
    }
    // public static int sum(float a, float b){//not overloading even return type is diff bcoz same no. of params and same params dt as above 
    //     return a+b;
    // }
    public static void main(String[] args) {
        // Parent reference, Child object
        Parent obj = new Child(); //upcasting

        // Accessing methods through parent reference
        obj.display(); // Output: Child display method (dynamic binding)

        int ans = sum(3, 5);
        int ans2 = sum(3, 5,6);
        float ans3 = sum(3.4f, 3.4f);
        System.out.println(ans); 
        System.out.println(ans2); 
        System.out.println(ans3); 
        Parent p = new Parent();
        p.setColor(2);
        System.out.println(p.num);
        Parent p2 = new Parent();
        p2.setColor(4);
        System.out.println(p2.num);
        System.out.println(p.num);
        p.setNum(7);
        System.out.println(p.getNum());

        // obj.show(); // Compile-time error: Parent reference doesn't have a `show` method
    }
}

class Parent {
    int num;
    private int num2;
    void setColor(int numb){
        num = numb;
    }
    void setNum(int numx){
        num2 = numx;
    }
    int getNum(){
        return num2;
    }
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
