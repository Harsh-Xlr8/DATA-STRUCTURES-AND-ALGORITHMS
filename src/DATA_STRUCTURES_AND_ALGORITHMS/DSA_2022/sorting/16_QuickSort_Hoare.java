package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

class QuickSort_Hoare {
    static int hpart(int arr[],int l,int h){
        int i = l-1,j = h+1;
        int pivot = arr[l];
        while(true){
            do{ i++; } while(arr[i]<pivot);
            do{ j--; } while(arr[j]>pivot);
            if(i>=j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
static void Qsort(int arr[],int l,int h){
        if(l<h){
            int p = hpart(arr,l,h);
            Qsort(arr,l,p);
            Qsort(arr,p+1,h);
        }
}
    public static void main (String[] args)
    {
        int arr[] = new int[]{8,4,7,9,3,10,5};

        int n = arr.length;
      Qsort(arr,0,n-1);

        for(int x: arr)
            System.out.print(x+" ");

    }
}
