class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long>set=new HashSet<>();
        int longcount=0;
        for(long num:nums){
            set.add(num);
        }
        for(long num:nums){
             long curr=num;
             int count=0;
             while(set.contains(curr)){
               count++;
               long next=curr*curr;
               if(next<0 ||!set.contains(next)){
                break;
               }
               curr=next;
             }
             longcount=Math.max(count,longcount);
        }
        return longcount>1?longcount:-1;
    }
}