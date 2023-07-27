package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

import java.util.*;
import java.lang.*;

// This class implements
// Comparator interface to compare
class mycmpr implements Comparator<Integer>
{
    // Sorts the Integers
    public int compare(Integer a, Integer b)
    {
        return a%2 - b%2;
    }
}

// Main class
class TestIN
{
    public static void main(String[] args)
    {
        // Integer array
        Integer[] arr = {5, 20, 10, 3, 12};

        // Sorting arrays by passing
        // arr and MyCmp object
        Arrays.sort(arr, new mycmpr());

        // Displaying the sorted array
        System.out.println(Arrays.toString(arr));
    }
}


