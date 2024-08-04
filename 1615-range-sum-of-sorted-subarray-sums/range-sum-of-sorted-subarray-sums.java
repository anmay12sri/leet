class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
            int total=0;
            for(int i=left-1;i<right;i++){
                total=(total+list.get(i))%1000000007;
            }
            return total;

    }
}