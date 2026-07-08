import java.util.*; 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>l = new ArrayList<>();
        if(numRows == 0)return l ;
        List<Integer> pr = new ArrayList<>();
        pr.add(1);
        l.add(pr);
        for(int i =1 ; i < numRows ; i++){
            List<Integer> currentRow = new ArrayList<>();

            for(int j =0 ; j<= i ; j++){
                int le = (j -1 < 0  )? 0 : pr.get(j -1 );

                int ri = (j >= pr.size())?0 : pr.get(j);
                currentRow.add(le + ri);
            }
            l.add(currentRow);
            pr = currentRow;   
        }
        return l ;
    }
}