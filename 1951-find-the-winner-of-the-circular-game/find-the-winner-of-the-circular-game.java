class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer>list=new ArrayList<>();

        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int i=0;

        while(list.size()>1){
            int ind=(i+k-1)%list.size();
            list.remove(ind);
            i=ind;
        }
        return list.get(0);
    }
}