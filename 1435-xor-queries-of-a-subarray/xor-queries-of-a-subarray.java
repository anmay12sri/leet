class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefix[]=new int[arr.length];
         prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]^prefix[i-1];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int L=queries[i][0];
            int R=queries[i][1];

            if(L==0){
                res[i]=prefix[R];
            }else{
                res[i]=prefix[L-1]^prefix[R];
            }
        }
        return res;
    }
}