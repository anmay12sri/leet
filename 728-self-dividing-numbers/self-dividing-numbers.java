class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(self(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean self(int n){
        int num=n;
        while(n!=0){
            int div=n%10;
            if(div==0)return false;
            if(num%div!=0)return false;
            n/=10;
        }
        return true;
    }
}