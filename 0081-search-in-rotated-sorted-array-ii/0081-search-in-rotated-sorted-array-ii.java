class Solution {
    public boolean search(int[] a, int target) {
        int s = 0 ;
        int e = a.length - 1 ;
        int mid =  0 ;
        if(a[0] == target)return true ;
        while(s <= e ){
            mid = s + (e -s )/2;
            if(a[mid] == target )return true  ;
            if(a[mid] == a[s] && a[mid] == a[e]){
                s++;
                e-- ;
            }
            else if(a[mid] >= a[s]){
                if(a[mid] >= target && target >= a[s]){
                    e = mid - 1 ;
                }
                else{
                    s = mid + 1 ;
                }
            }
            else{
                if(a[mid] <= target && a[e] >= target){
                    s= mid + 1 ;

                }
                else{
                    e = mid - 1 ;
                }
            }
        }
        return false ;
    }
}