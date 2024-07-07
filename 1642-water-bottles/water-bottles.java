class Solution {
    public int numWaterBottles(int numBottle, int numExchange) {
        int consumed=0;
        while(numBottle>=numExchange){
            consumed+=numExchange;
            numBottle-=numExchange;
            numBottle+=1;
        }
        return consumed+numBottle;
    }
}