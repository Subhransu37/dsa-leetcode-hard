class Solution {
    public List<Integer> majorityElement(int[] a) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int i : a ){
            h.put(i , h.getOrDefault(i , 0 )+ 1 );
        }
        for(int i : h.keySet()){
            if(h.get(i) > a.length /3 ){
                l.add(i ) ;
            }
        }
        return l ;
    }
}