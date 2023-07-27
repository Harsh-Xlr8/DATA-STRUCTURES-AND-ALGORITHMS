package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;
class Hoare_Partition {
static int hoarePart(int arr[],int l,int h){
int i=l-1,j=h+1;
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

public static void main(String[] args){
    int a[] = new int[]{5,3,8,4,2,1,3,10};
    int n = a.length;
    hoarePart(a,0,n-1);
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }

}
}
