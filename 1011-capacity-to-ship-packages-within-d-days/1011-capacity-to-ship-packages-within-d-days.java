class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int e = 0 ;
        int s = 0 ; 
        for(int n : weights){
            e += n;
            s = Math.max(s, n);
        }
        int es = 0 ;
        int mid = 0;

        int day = 1 ;
        int sum = 0 ;

        while( s <= e ){
            mid = s + (e -s ) /2 ;
            sum = 0 ;
            day = 1 ;
            for(int weight : weights){
                if(sum + weight <= mid){
                    sum += weight ;
                }
                else{
                    day++;
                    sum = weight;
                }
            }
            if(day <= days){
                es = mid;
                e = mid -1 ;
            }
            else{
                s = mid + 1 ;
            }
        }
        return es ;
    }
}