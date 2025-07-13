import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void addToArrayForm(int[] num, int k) {


        for (int i = num.length-1; i > 0 ; i--) {
            int temp = 0;
            while (k > 0) {
                temp = k % 10;
                k  /= 10;
                break;
            }
          if(temp != 0){
              num[i] = num[i] + temp;
          }

        }
        System.out.println(Arrays.toString(num));


    }

    public static void main(String[] args) {
        addToArrayForm(new int[]{1, 2, 0, 0}, 34);
    }
}