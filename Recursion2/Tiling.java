
public class Tiling {

    //logic: in notes
    static int tilingPlace(int n){
        if (n==0||n==1) {
            return 1;
        }
        int v=tilingPlace(n-1);
        int h=tilingPlace(n-2);
        return v+h;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(tilingPlace(n));
        
    }
}
