class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
         int n=customers.length;
         int unsat=0;
         int maxunsat=0;
         for(int i=0;i<minutes;i++){
            unsat+=customers[i]*grumpy[i];
         }
         maxunsat=unsat;
         int i=0;
         int j=minutes;
         while(j<n){
            unsat+=customers[j]*grumpy[j];
            unsat-=customers[i]*grumpy[i];
            maxunsat=Math.max(maxunsat,unsat);
            i++;
            j++;
         }
         int totalsat=maxunsat;
         for(int k=0;k<n;k++){
            if(grumpy[k]==0){
                totalsat+=customers[k]*(1-grumpy[k]);
            }
            
         }
         return totalsat;
    }
}