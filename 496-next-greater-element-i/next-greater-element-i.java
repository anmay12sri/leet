class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       // int final[]=new int[nums2.length];
        Stack<Integer>st=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            while(!st.empty()  && st.peek()<nums2[i]){
                  map.put(st.pop(),nums2[i]);

            }
            st.push(nums2[i]);
        }
        int greater[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            greater[i]=map.getOrDefault(nums1[i],-1);
        }
        return greater;
    }
}