package DATA_STRUCTURES_AND_ALGORITHMS.DSA_2022.sorting;

 class intersection_Naive {
 static void Intersection(int a[],int b[],int m,int n){
     for(int i=0;i<m;i++){
         if(i>0 && a[i]==a[i-1])
             continue;
         for(int j=0;j<n;j++){
             if(a[i]==b[j]){
                 System.out.print(a[i]+" ");
                 break;
             }
         }
     }
     }public static void main(String[] args){
         int a[] = new int[]{3,5,5,6,6,10,20};
         int b[] = new int[]{1,7,5,9,9,10};
         int m = a.length;
         int n = b.length;
         Intersection(a,b,m,n);
     }
}
