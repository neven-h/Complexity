public class Road {

    public static int shortestRoad(int []a, int []b){
       return switchPoint(a, b, 0);
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

        //missing the part where i apply an action over switch
    }
}
