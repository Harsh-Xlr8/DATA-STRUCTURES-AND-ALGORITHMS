package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;
import java.util.*;
class Interval implements Comparable<Interval>
{
    int s, e;

    Interval(int s, int e)
    {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Interval a)
    { return this.s - a.s; }
}
class solution{
    static void mergeIntervals(Interval[] arr,int n){
        int res = 0;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[res].e>=arr[i].s){
                arr[res].e = Math.max(arr[res].e,arr[i].e);
                arr[res].s = Math.min(arr[res].s,arr[i].s);
            }else{
                res++;
                arr[res] = arr[i];
            }
        }for(int i=0;i<=res;i++)
            System.out.print("["+arr[i].s+","+arr[i].e+"]"+" ");

    }

    public static void main(String[] args) {
        Interval[] arr = {new Interval(2,5),new Interval(3,10),new Interval(11,15),new Interval(14,19)};
       int n = arr.length;
        mergeIntervals(arr,n);
    }
}


