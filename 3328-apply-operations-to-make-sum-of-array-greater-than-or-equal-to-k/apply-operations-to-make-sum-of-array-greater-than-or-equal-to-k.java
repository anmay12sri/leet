class Solution {
    public int minOperations(int k) {
        int x=(int)Math.sqrt(k);//3
        return x+(k-1)/x-1;//3+(10/3)-1=5
    }
}