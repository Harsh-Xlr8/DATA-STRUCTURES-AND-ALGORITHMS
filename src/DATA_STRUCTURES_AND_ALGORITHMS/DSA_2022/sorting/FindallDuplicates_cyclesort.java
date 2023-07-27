package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

/*public class FindallDuplicates_cyclesort {
    List<Integer> allDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                while (arr[correct] != arr[i]) {
                    if (arr[i] != arr[correct]) {
                        int temp = arr[i];
                        arr[i] = arr[correct];
                        arr[correct] = temp;
                    } else {
                        i++;
                    }
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    ans.add(index);
                }
            }
            return ans;
        }
    }
}*/

