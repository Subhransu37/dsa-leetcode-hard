class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        
        int []cum = new int[k];
        distrubution(cum ,cookies , k , 0);
        return ans;
    }
    public void distrubution(int[]cus , int []co , int k , int j){
        if(j == co.length){
           int max= 0 ; 
           for(int i : cus){
                max = Math.max(i , max);
           } 
           ans = Math.min(max , ans);
           return ;
        }
        for(int i = 0; i < k ; i++){
            cus[i] += co[j];
            distrubution(cus , co , k , j + 1);
            cus[i] -= co[j];
        }
    }
}