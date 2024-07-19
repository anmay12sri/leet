class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>rowlis=new ArrayList<>();
        List<Integer>collis=new ArrayList<>();
        List<Integer>result=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;

        for(int row=0;row<m;row++){
            int minEle=Integer.MAX_VALUE;
            for(int col=0;col<n;col++){
                minEle=Math.min(minEle,matrix[row][col]);
            }
                rowlis.add(minEle);
        }

        for(int col=0;col<n;col++){
            int maxEle=Integer.MIN_VALUE;
             for(int row=0;row<m;row++){
                maxEle=Math.max(maxEle,matrix[row][col]);
             }
                collis.add(maxEle);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==rowlis.get(i) && matrix[i][j]==collis.get(j)){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}