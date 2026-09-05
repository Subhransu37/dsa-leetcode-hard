import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int e = 0 ;
        for(int n : piles ){
            e = Math.max(n , e);
        }
        int es = 0 ;
        int s = 0 ;
        int mid = 0 ;
        int hrs = 0 ;
        while(s <= e ){
            mid = s + (e - s)/2 ;
            hrs = 0 ;
            for(int n : piles){
                hrs += (int)Math.ceil((double)n / mid);
            }

            if(hrs <= h && mid != 0  ){
                es = mid ;
                e = mid - 1 ;
            }
            else{
                s= mid + 1 ;
            }
        }
        return es ;
    }
}