class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        backtrack(list,0,0,"",n);
        return list;
    }
    public static void backtrack(List<String>list,int open,int close,String curr,int n){
        if(curr.length()==2*n){
            list.add(curr);
            return;
        }
        if(open<n){
            backtrack(list,open+1,close,curr+'(',n);
        }
        if(close<open){
            backtrack(list,open,close+1,curr+')',n);
        }
    }
}