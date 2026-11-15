class Solution {
    private int ans = Integer.MAX_VALUE;
    public int minimumTimeRequired(int[] jobs, int k) {
        int[]a = new int[k];
        helper(jobs , a , k , 0  );
        return ans ; 
    }
    private void helper(int[]jobs , int[] a  , int k , int p){
        int max= 0 ;
        if(p == jobs.length){
            for(int i : a){
                max = Math.max(i ,max);
            }
            ans = Math.min(max , ans);
            return;
        }
        int  job = jobs[p];
        for(int i = 0 ; i < k ; i++){
            if(a[i]+job >= ans)continue ;
            a[i] += job ;
            helper(jobs , a , k , p + 1);
            a[i] -= job;

            if(a[i] == 0)break; 
        }
    }
}