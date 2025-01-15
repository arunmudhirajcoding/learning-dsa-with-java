
public class shortestPath {
    public static void main(String[] args) {
        String path = "NEWSSsw";
        int x=0,y=0;
        // tc = O(n)
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i)=='N') {
                y++;
            }
            else if (path.charAt(i)=='S') {
                y--;
            } 
            else if (path.charAt(i)=='W') {
                x--;
            }
            else{
                x++;
            }
        }
        System.out.println("the shortest path is "+(float)(Math.sqrt(x*x + y*y)));
    }
}
