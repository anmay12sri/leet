class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Integer[]arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr, new Comparator<Integer>(){
            public int compare(Integer A, Integer B){
               int mapA=mapped(A,mapping); 
               int mapB=mapped(B,mapping); 
               return Integer.compare(mapA,mapB);
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums; 
    }
    public int mapped(int num,int[]mapping){
        StringBuilder mapped = new StringBuilder();
        String numStr = String.valueOf(num);
        for (char digit : numStr.toCharArray()) {
            mapped.append(mapping[digit - '0']);
        }
        return Integer.parseInt(mapped.toString());
    }
}