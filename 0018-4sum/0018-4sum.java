import java.util.*; 
class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        long sum = 0 ;
        List<List<Integer>> lis=  new ArrayList<>();
         
        Arrays.sort(a);
        
        for(int i = 0 ; i < a.length- 3; i++){
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            for(int j = i + 1 ; j < a.length - 2  ; j++){
                
                if (j > i + 1 && a[j] == a[j - 1]) {
                    continue;
                }
                int left = j +1 ;
                int right = a.length - 1 ;

                while( left < right ){
                   
                   sum = (long) a[i]
                 + (long) a[j]
                    + (long) a[left]
                 + (long) a[right];
                    if(sum == (long)(target)){
                        lis.add(Arrays.asList(
                            a[i],
                            a[j],
                            a[left],
                            a[right] 
                        ));
                        left ++ ;
                        right-- ; 
                        while (left < right && a[left] == a[left - 1]) {
                            left++;
                        }
                       while (left < right && a[right] == a[right + 1]) {
                            right--;
                        }
                    }
                    else if(sum > target){
                        right-- ; 
                    }
                    else{
                        left++ ; 
                    }
                }
            }

        }
        return lis;
    }
}