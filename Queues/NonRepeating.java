import java.util.LinkedList;
import java.util.Queue;

public class NonRepeating {
    //First Non-Repeating letter in a stream of characters
    //idea: if stream of characters means mostly of Queue based questions
    //tc=O(n)

    
    public static void printNonRepeating(String str){
        int freq[] = new int[26];
    
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a']>1) {
                q.remove();    
            }

            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
