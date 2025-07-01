import java.util.Stack;

public class DuplicatePratheses {
    //eg: ( (a+(b)) )
    //idea: b/w pais of paratheses something exist is vaild
    // (a+b) vaild something is a+b
    // ((b)) in valid (b) - ( ) after pair of b is elemenet outer is mt 
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.pop()!='(') {
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String str = "(a+b)";
        
        System.out.println(isDuplicate(str));
    }
}
