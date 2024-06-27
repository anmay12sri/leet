class Solution {
    public int findCenter(int[][] edges) {
       int x1=edges[0][0];
       int x2=edges[0][1];
       int y1=edges[1][0];
       int y2=edges[1][1];

        if(x1==y1 || x1==y2){
            return x1;
        }

        return x2;
       
    }
}
