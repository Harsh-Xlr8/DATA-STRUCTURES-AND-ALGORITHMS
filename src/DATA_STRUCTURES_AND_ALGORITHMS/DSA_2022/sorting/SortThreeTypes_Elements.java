package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

class SortThreeTypes_Elements{
    static void STT(int[] arr,int n){
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(arr[m]==0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++;m++;
            }else if(arr[m]==1){
                m++;
            }else{
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
    } public static void main (String[] args)
    {
        int[] arr = new int[]{0,1,1,2,0,1,1,2};

        int n = arr.length;

       STT(arr,n);

        for(int x:arr)
            System.out.print(x+" ");

    }
}
