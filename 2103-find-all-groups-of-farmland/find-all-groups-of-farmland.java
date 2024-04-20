class Solution {
    int x=0;
    int y=0;
    public int[][] findFarmland(int[][] land) {
        List<int[]>list=new ArrayList<>();

        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j]==1){
                    x=i;
                    y=j;
                    dfs(land,i,j);
                    list.add(new int[]{i,j,x,y});
                }
            }
        }
        return list.toArray(new int[0][0]);

    }
    public void dfs(int[][]land,int i,int j){
        if(i<0||i>=land.length||j<0||j>=land[0].length||land[i][j]==0){
            return;
        }
        land[i][j]=0;
        dfs(land,i+1,j);
        dfs(land,i-1,j);
        dfs(land,i,j-1);
        dfs(land,i,j+1);

        x=Math.max(i,x);
        y=Math.max(j,y);
    }
}