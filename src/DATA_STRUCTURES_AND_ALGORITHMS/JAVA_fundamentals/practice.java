package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

class cyzs{
    static int large(int arr[]){
        int res =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res])
                res=i;

        }return res;
    }public static void main (String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(large(arr));
    }
}