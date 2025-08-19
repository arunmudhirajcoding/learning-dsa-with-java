import java.util.Stack;

public class DuplicatePratheses {
    //eg: ( (a+(b)) )
    //idea: b/w pais of paratheses something exist is vaild
    // (a+b) vaild something is a+b
    // ((b)) in valid (b) - ( ) after pair of b is elemenet outer is mt 
    //couting inside elements. if count is not 0 means something is there then check for next iterative.
    // if count is 0 then return true for it is duplicate 
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {//iterative on string
            char ch = str.charAt(i);
            if (ch == ')') {//if close then remove the elements and count
                int count = 0;
                while (s.pop()!='(') {
                    s.pop();
                    count++;
                }
                if (count<1) {//count is 0 then duplicate if not go next 
                    return true;
                }
            }
            else{// if not close then push into stack
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
