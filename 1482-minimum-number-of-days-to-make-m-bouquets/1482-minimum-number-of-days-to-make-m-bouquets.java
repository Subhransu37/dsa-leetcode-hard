class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int maxday = 0;
        int minday = Integer.MAX_VALUE; 
        if(bloomDay.length < m * k )return -1 ;
        for (int day : bloomDay) {
            maxday = Math.max(maxday, day);
            minday = Math.min(minday , day );
        }
        int mid = 0 ;
        int c = 0 ;
        int nfb = 0 ;
        int ans = -1 ;
        while(minday <= maxday){
            mid = (minday + maxday ) / 2 ;
            c = 0;
            
            nfb = 0;
            for(int i : bloomDay){
                if(i <= mid){
                    c ++ ;
                }
                else{
                    nfb += c/ k ;
                    c = 0 ;
                }
            }
            nfb += c/ k ;

            if(nfb >= m){
                ans = mid ;
                maxday = mid - 1;

            }
            else{
                minday = mid + 1 ;
            }
        }   
        return ans; 
    }
}