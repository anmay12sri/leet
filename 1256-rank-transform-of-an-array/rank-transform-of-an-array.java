class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
       int res[]=new int[n];
       int temp[]=new int[n];
       Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++){
        temp[i]=arr[i];
       }
       Arrays.sort(temp);
      int rank=1;
      for(int i=0;i<temp.length;i++){
        if(!map.containsKey(temp[i])){
            map.put(temp[i],rank++);
        }
      }

      for(int i=0;i<n;i++){
        res[i]= map.get(arr[i]);
      }
      return res;


    }
}