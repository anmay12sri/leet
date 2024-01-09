class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //1,2,2,3,3,4,7,8
        int arr[]=new int[nums.length+1];
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=nums[i];
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}