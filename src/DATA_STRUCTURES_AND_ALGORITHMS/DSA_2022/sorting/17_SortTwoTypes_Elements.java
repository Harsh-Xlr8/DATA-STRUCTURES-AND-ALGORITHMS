package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;


class SortTwoTypes_Elements {
    static void STE(int[] arr,int n){
 int i=-1,j=n;
 while(true){
     do{ i++; } while(arr[i]<0);
     do{ j--; } while(arr[j]>0);
     if(i>=j)
         return;
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
 }
    }
    public static void main (String[] args)
    {
        int[] arr = new int[]{13,-12,18,-10};

        int n = arr.length;

       STE(arr,n);
       for(int x:arr){
           System.out.print(x+" ");
       }

    }
}
