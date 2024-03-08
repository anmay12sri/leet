class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        int maxfreq=0;

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            maxfreq=Math.max(maxfreq,map.get(x));
        }
        for(int freq:map.values()){
            if(freq==maxfreq) count+=freq;
        }
        return count;
    }
}