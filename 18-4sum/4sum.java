class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>list=new HashSet<>();
        if(nums==null || nums.length<4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
             for(int j=i+1;j<nums.length-2;j++){
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[l]+(long)nums[r];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                    }else if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                }
             }
        }
        return new ArrayList<>(list);
    }
}