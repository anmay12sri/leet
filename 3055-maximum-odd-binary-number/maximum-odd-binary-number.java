class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int ones=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        if(ones==0)return s;

        StringBuilder res=new StringBuilder();
        for(int i=0;i<ones-1;i++){
            res.append('1');
        }
        for(int i=0;i<n-ones;i++){
            res.append('0');
        }
        res.append('1');
        return res.toString();
    }
}