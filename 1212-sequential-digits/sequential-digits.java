class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int nums=i;
            for(int j=i+1;j<=9;j++){
                nums=nums*10+j;

                if(nums>=low && nums<=high){
                    list.add(nums);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}