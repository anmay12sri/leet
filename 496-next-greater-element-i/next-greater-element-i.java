class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer>st=new Stack<>();
       Map<Integer,Integer>map= new HashMap<>();
        

       for(int i=0;i<nums2.length;i++){
           while(st.empty()==false && st.peek()<=nums2[i]){
               map.put(st.pop(),nums2[i]);
           }
           st.push(nums2[i]);
       }
       int res[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
           res[i]=map.getOrDefault(nums1[i],-1);
       }
       return res;
    }
}