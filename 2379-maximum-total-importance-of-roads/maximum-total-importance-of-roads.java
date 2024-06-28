class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int [] degree=new int[n];
        for(int []road:roads){
            degree[road[0]]++;
            degree[road[1]]++;
        }
        Integer[]cities=new Integer[n];
        for(int i=0;i<n;i++){
            cities[i]=i;
        }
        Arrays.sort(cities,(a,b)->Integer.compare(degree[b],degree[a]));

        int []value=new int[n];
        int curr=n;
        for(int city:cities){
            value[city]=curr--;
        }
        long totimp=0;
        for(int []road:roads){
            totimp+=value[road[0]]+value[road[1]];
        }
        return totimp;
    }
}