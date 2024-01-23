class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList();
        int m=matrix.length;//rows
        int n=matrix[0].length;//columns
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
             if (top <= bottom) {
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
             }
             if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
             }

        }
        return list;
    }
}