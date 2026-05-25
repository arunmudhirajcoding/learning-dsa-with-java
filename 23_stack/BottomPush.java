import java.util.Stack;

public class BottomPush {
    //using recurrsion
    public static void pushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    //using loop
    public static void pushAtBottom2(Stack<Integer> s,int data){
        Stack<Integer> s2 = new Stack<>();
        int n = s.size()-1;
        while (!s.isEmpty()) {
            s2.push(s.pop());
        }
        s.push(data);
        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        pushAtBottom(s, 5);
        System.out.println(s);
        pushAtBottom2(s, 6);
        System.out.println(s);
    
        
    }
}
