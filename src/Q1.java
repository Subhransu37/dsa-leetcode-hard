public class Q1 {
    public static void main(String[] args) {
        int []a = {12 ,2,3,45,667, 9877, 87541 , 9875};

        int digitcounter = 0;
        for (int i = 0; i < a.length ; i++) {
            int count = 0;
            int temp = a[i];
            while (temp > 0 ){
                temp /= 10;
                count+= 1;
            }
            if(count % 2 ==0){
                digitcounter++;
            }
        }
        System.out.println(digitcounter);

    }
}
