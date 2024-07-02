class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        List<Integer>list=new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
              i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            
            }
        }
        int k=0;
        int res[]=new int[list.size()];
        while(k<res.length){
        res[k]=list.get(k);
        k++;
        }
        return res;
    }
}