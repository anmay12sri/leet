class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];

      for(int i=2*n-1;i>=0;i--){
          while(!st.empty() && st.peek()<=nums[i%n]){
              st.pop();
          }
          if(i<n){
              if(!st.isEmpty()){
                  res[i]=st.peek();
              }else{
                  res[i]=-1;
              }
          }
          st.push(nums[i%n]);
      }
      return res;
    }
}