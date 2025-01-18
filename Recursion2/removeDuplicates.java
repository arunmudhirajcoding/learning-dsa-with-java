
public class removeDuplicates {

    // logic: ch-a gives idx of alphabet 
    //eg: ch= a a-a=0, b: b-a = 1, c:c-a=2
    //          32-32=0   33-32=1
    
    static void rmDupi(String str,StringBuilder newstr, boolean map[],int idx){
        //end case
        if (str.length()==idx) {
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch-'a']==true) {//if array has true means char it exist already

            //duplicate present
            rmDupi(str, newstr, map, idx+1);
        } else {
            map[ch-'a']=true;//if there is no character in array set it true
            rmDupi(str, newstr.append(ch), map, idx+1);
            
        }

    }
    public static void main(String[] args) {
        String str = "arunkumar";
        rmDupi(str,new StringBuilder(""),new boolean[26],0);        
    }
}
