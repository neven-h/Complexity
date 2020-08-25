public class Road {

    public static int shortestRoad(int []a, int []b){
        int min = switchPoint(a, b, 0);
        for (int i = 1; i < a.length; i++) {
            int temp = switchPoint(a, b, i);
            min = (temp < min) ? temp : min;
        }
        return min;
    }

    public static int switchPoint(int []a, int[] b, int switch){
        int sumA, sumB, temp =0;
        for(int i=0; i<switch; i++) {
            //     temp = a[switch];
            sumA += a[i];
        }
        for(int j=switch; j<b.length; j++ ){
            sumB += b[j];
        }
        return sumA + sumB;
    }
}
