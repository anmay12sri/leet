class Solution {
    public int numWaterBottles(int numsBottles, int numsExchange) {
        int consumed=0;
        while(numsBottles>=numsExchange){
            consumed+=numsExchange;
            numsBottles-=numsExchange;
            numsBottles+=1;
        }
        return consumed+numsBottles;
    }
}