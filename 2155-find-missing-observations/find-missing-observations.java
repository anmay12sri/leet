class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int totalsum=(m+n)*mean;//21
        int sum=0;

        for(int roll:rolls){
            sum+=roll;//12
        }
        int remaining=totalsum-sum;//9

        if(remaining<n || remaining>6*n){
            return new int[0];
        }

        int base=remaining/n;//2
        int remainder=remaining%n;//1

        int res[]=new int[n];

        for(int i=0;i<n;i++){
            res[i]=base+(i<remainder?1:0);
        }
        return res;
    }
}