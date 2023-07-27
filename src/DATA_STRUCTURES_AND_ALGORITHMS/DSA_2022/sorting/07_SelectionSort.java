package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

class SelectionSort_07 {
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_ind = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                   min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind]=arr[i] ;
            arr[i] = temp;
        }
    }
        public static void main(String[] args){
            int arr[] = {2, 1, 4, 3};
            selectionSort(arr, 4);

            for(int i = 0; i < 4; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

