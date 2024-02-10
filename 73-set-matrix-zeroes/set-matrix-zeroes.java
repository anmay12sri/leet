class Solution {
    public void setZeroes(int[][] matrix) {
        int m[]=new int[matrix[0].length];
        int n[]=new int[matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    n[i]=1;
                    m[j]=1;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(n[i]==1||m[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}