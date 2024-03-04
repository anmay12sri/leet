class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i=0;
        int j=tokens.length-1;
        Arrays.sort(tokens);
        int score=0;
        int ans=0;

        while(i<=j){
         if(tokens[i]<=power){
             score+=1;
             if(ans<score){
                 ans=score;
             }
             power-=tokens[i];
             i++;
         }else if(score>0){
             power+=tokens[j];
             score-=1;
             j--;
         }else{
             break;
         }
        }
        return ans;
    }
}