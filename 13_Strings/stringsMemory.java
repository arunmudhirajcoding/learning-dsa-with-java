
public class stringsMemory {
    public static void main(String[] args) {
        String str1 = "Arun";
        String str2 = "Arun";
        // str1 and str2 are 2 reference variable in stack pointing same object in heap 0f string pool or intern pool 
        String str3 = new String("Arun");
        // when using new keyword used then new object is created in intern pool 
        // this is called interning

        //conflicts

        // strings are immutable so when we give little but of changes in original string it creats new string with that string which cause memory misuse and increase tc=O(n*m)=O(n^2)

        //eg:
        
        String str = "abcdefghijklmnopqrstuvwxyz";
        String name = "Arun";
        
        // tc = O(26*n)
        for (int i = 0; i < str.length(); i++) {
            name += str.charAt(i); // creats new string at every concat
        }
        System.out.println(name);   

        // so we use stringbuilder
    }
}
