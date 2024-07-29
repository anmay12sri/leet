class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        int n=rating.length;

        for(int j=1;j<n-1;j++){
        int leftless=0,leftgreat=0,rightless=0,rightgreat=0;
           for(int i=0;i<j;i++){
            if(rating[i]<rating[j]){
                leftless++;
            }else{
                leftgreat++;
            }
           }

           for(int k=j+1;k<n;k++){
            if(rating[k]<rating[j]){
                rightless++;
            }else{
                rightgreat++;
            }
           }
           count+=leftless*rightgreat+rightless*leftgreat;
        }
        return count;
        
    }
}