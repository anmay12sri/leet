class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
            int freqa=map.get(a);
            int freqb=map.get(b);

            if(freqa!=freqb){
                return freqa-freqb;
            }else{
                return b-a;
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}