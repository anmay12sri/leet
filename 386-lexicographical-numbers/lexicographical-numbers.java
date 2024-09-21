class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(i,n,res);
        }
        return res;
    }
    public void solve(int curr,int n,List<Integer>res){
        if(curr>n){
            return ;
        }
        res.add(curr);
        for(int i=0;i<=9;i++){
            if(curr*10+i > n)break;
            solve(curr*10+i,n,res);
        }
    }
}