import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList <Integer> l = new ArrayList<> ();
        for (int i = 2; i < 41; i++) {
            l.add(i);
        }
        elm(l);
    }

    private static void elm(ArrayList<Integer> l) {
        ArrayList <Integer> update = new ArrayList<> ();
        for(int e : l){

            if (isprime (e)) {
                System.out.print (e + "\t");
                update.add(e);

            }



        }
        System.out.println ();
        System.out.println ("update version " + update);
    }

    private static boolean isprime(int e) {
        if(e <= 1){return false;}
            for (int i = 2; i <=Math.sqrt (e) ; i++) {
                if(e % i == 0 ){
                    return false;

                }
            }
        return true;
    }
}