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
        res.add(curr); //curr n se chota toh pehle hi add ho jayega
        for(int i=0;i<=9;i++){
            if(curr*10+i > n)break; // ek particular series ka number bda huya n se toh break
            solve(curr*10+i,n,res);// nahi toh recursive call krke usko bhi add kr lenge
        }
    }
}