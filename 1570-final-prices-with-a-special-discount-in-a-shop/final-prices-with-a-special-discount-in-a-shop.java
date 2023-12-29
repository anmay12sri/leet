class Solution {
    public int[] finalPrices(int[] prices) {
        int i;
        int j;
        int arr[]=new int[prices.length];
        for( i=0;i<prices.length;i++){
            for( j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                arr[i]=prices[i]-prices[j];
                break;
            }
        }
        if(j==arr.length){
            arr[i]=prices[i];
        }
        }
        return arr;
    }
}