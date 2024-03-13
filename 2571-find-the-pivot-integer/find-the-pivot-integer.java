class Solution {
    public int pivotInteger(int n) {
        int sum1=0;
        int sum2=0;
        int i=1;
        int j=n;
        while(i<j){
           if(sum1<sum2){
            
            sum1+=i;
             i++;
           }else if(sum1>sum2){
            sum2+=j;
            j--;
           }else{
            sum1+=i;
            sum2+=j;
            i++;
            j--;
           }
        }
        return sum1==sum2?i:-1;
    }
}