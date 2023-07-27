package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

 class BubbleSort_06 {

    //NAIVE METHOD
/*
    static void BubbleSort(int arr[], int n){
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++) {
if(arr[j]>arr[j+1]){
    int temp = arr[j];
    arr[j] = arr[j+1];
    arr[j+1] = temp;
}
            }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,6,1},n=5;
        BubbleSort(arr,n);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
*/
    //OPTIMISED METHOD

static void BubbleSort(int arr[],int n){
    for(int i=0;i<n;i++){
        boolean swapped = false;
        for(int j=0;j<n-i-1;j++){

            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }if(swapped== false)
            break;
    }
}
    public static void main(String[] args) {
        int arr[] = {2,4,2,6,1},n=5;
        BubbleSort(arr,n);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }}
}
