class Solution {
    public double myPow(double x, int n) {
        long m=n;
        double res=1;
        if(x==0)return 0;
        else if(m==0)return 1;
        else if(m<0){
            m=m*(-1);
            x=1/x;
        }
        while(m>0){
            if(m%2==0){
                x=x*x;
                m/=2;
            }else{
                m=m-1;
                res=res*x;
            }
        }
        return res;
    }
}