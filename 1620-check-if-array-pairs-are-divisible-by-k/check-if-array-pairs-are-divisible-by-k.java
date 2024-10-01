class Solution {
    public boolean canArrange(int[] arr, int k) {
        int map[]=new int[k];

        for(int num:arr){
            int rem=((num % k)+ k) % k; // for both even and odd numbers
            map[rem]++;
        }
        if(map[0] % 2 !=0){
            return false;// special case for dividing number by itself (need to found the pair)
        }

        for(int rem=1;rem<=k/2;rem++){
            int comp=k-rem;
            if(map[rem]!=map[comp]){ //like for 5 --> 2 ka comp 3 hoga
                return false;
            }
        }
        return true;
    }
}