import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        System.out.println (dial(" " , "12"));
    }

    private static ArrayList<String> dial(String p, String up) {


        if(up.isEmpty ()){
            ArrayList<String> l = new ArrayList<> ();
            l.add (p);
            return l ;
        }

        int d = up.charAt (0) - '0';
        ArrayList<String> a =new ArrayList<> ();
        for (int i = (d - 1)* 3; i < d* 3  ; i++) {
            char ch  = (char) ('a' + i);
             a.addAll (dial( p + ch , up.substring (1)));




        }
        return a ;



    }
}
