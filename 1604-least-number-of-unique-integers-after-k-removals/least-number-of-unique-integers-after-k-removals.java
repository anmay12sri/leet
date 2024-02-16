class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Integer>x=new ArrayList<>();
        int count=0;
        for(int a:map.values()){
            x.add(a);
        }
        Collections.sort(x);
        for(int i=0;i<x.size();i++){
            if(k>x.get(i)){
                k-=x.get(i);
                x.set(i,0);
            }else{
                x.set(i,x.get(i)-k);
                k=0;
            }
            if(x.get(i)!=0)count++;
        }
        return count;
    }
}