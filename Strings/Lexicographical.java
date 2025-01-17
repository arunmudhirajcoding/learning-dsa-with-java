
public class Lexicographical {
    public static void main(String[] args) {
        String str[] = {"apple", "mango", "banana"};

        // lexicographical means comparing bases of letter order
        // if first letter of str1 is 'a' and str2 is "b" then a is less then b 
        
        //if x be the length of largest string then tc = O(x*n)
        // inbuit functions compareto and comparetoignorcase which use lexicographical method to compare strings
        String laregeString = str[0];
        for (int j = 1; j < str.length; j++) {
            
            if (laregeString.compareToIgnoreCase(str[j])<0){//<0 means str1 less than str2. >0 means str1 is greater than str2, =0 means str1 = str2
                laregeString = str[j];
            }
        }
        System.out.println(laregeString);
    }    
}
