class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean visited[] = new boolean[n];
        return dfs(adj,source,destination,visited);
    }
    public boolean dfs(List<List<Integer>> adj,int s,int e,boolean visited[]){
        if(s==e)
        return true;
        if(visited[s])
        return false;
        visited[s] = true;
        
        for(int i=0;i<adj.get(s).size();i++){
            if(dfs(adj,adj.get(s).get(i),e,visited)==true)
            return true;
        }
        return false;
    }
}