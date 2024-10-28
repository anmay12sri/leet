class Solution {
    public int longestSquareStreak(int[] nums) {
       Set<Long>set=new HashSet<>();

       for(long num:nums){
        set.add(num);
       }
       int longestcount=0;
       for(long num:nums){
        long curr=num;
        int count=0;

        while(set.contains(curr)){
            count++;
            long next=curr*curr;
        if(next<0 || !set.contains(next)){
            break;
        }
          curr=next;
        }
       
       longestcount=Math.max(count,longestcount);
       }
       return longestcount>1?longestcount:-1; 
    }
}