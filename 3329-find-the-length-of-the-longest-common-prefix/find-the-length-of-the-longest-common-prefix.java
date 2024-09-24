class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer>set=new HashSet<>();
        for(int i:arr1){
            while(!set.contains(i) && i>0){
                set.add(i);
                i/=10;
            }
        }
        int res=0;
        for(int i:arr2){
          while(!set.contains(i) && i>0){
            i/=10;
          }
          if(i>0){
            res=Math.max(res,(int)(Math.log(i)/Math.log(10))+1);
          }
        }
        return res;
    }
}