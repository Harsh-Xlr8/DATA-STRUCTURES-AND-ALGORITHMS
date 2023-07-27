package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;
import java.util.*;

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class point
{
    int x, y;
    point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements
// Comparator interface to compare
class MyCmp implements Comparator<point>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(point p1, point p2)
    {
        return p1.x - p2.x;
    }
}

// Main class
class test
{
    public static void main(String[] args)
    {
        // Array of 3 objects
        point arr[] = {
                new point(10, 20),
                new point(3, 12),
                new point(5, 7) };

        // Sorting the object containing the array
        // by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());

        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                    arr[i].x + " " + arr[i].y);
    }
}
