package DATA_STRUCTURES_AND_ALGORITHMS.Hashing;

import java.util.HashMap;

class LongestCommonSpan {
  static int lSpan(int[] arr1,int[] arr2,int n){
  int[] temp = new int[n];
  int res=0;
  for(int i=0;i<n;i++) {
   temp[i] = arr1[i] - arr2[i];
  }
   HashMap<Integer,Integer> map = new HashMap<>();
  map.put(0,-1);
  int sum=0;
   for(int i=0;i<n;i++){
    sum+=temp[i];
    if(sum==0){
     res = i+1;
    }if(map.containsKey(sum)){
     int index = map.get(sum);
     int len = i-index;
     if(len>index){
      res = len;
     }
    }else{
     map.put(sum,i);
    }
   }
return res;
   //   int res=0;
//   for(int i=0;i<n;i++) {
//    int sum1 = 0, sum2 = 0;
//    for (int j = i; j < n; j++) {
//       sum1+=arr1[j];
//       sum2+=arr2[j];                                NAIVE METHOD
//       if(sum1==sum2){
//        res = Math.max(res,j-i-1);
//       }
//    }
//   }
//   return res;
   }

  public static void main(String[] args) {
   int[] arr1 = {1,1,0,0,0,1,0};
   int[] arr2 = {0,1,0,0,0,0,0};
   int n = 7;
   System.out.println(lSpan(arr1,arr2,n));
  }
}
