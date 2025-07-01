import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch =='[') { // if open paratheses then push it into the stack
                s.push(ch);
            }else{
                if (s.isEmpty()) {//if first paratheses is the closed then false
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||(s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')   ) {//if any corresponend closed paratheses then remove open paratheses
                    s.pop();
                }else{ // if not corressponned closed paratheses matches then return false
                    return false;
                }
            }
        }
        if (s.isEmpty()) {//after all corresponed paratheses are cleard(ie stack is mt) then parathese are in correct order
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({}))";
        System.out.println(isValid(str));
    }
}
