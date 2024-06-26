class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i=0;
        int max=0;
        int freq[]=new int[1001];


        for(int num:arr1){
            freq[num]++;
            max=Math.max(num,max);
        }
        int sorted[]=new int[arr1.length];
        for(int num:arr2){
            while(freq[num]-->0){
            sorted[i]=num;
            i++;
            }
        }
        for(int x=0;x<=max;x++){
            while(freq[x]-->0){
                sorted[i]=x;
                i++;
            }
        }
        return sorted;

        
    }
}