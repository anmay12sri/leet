class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();

        for(int i=0;i<strs.length ;i++){
            char c[]=strs[i].toCharArray();
            Arrays.sort(c);//aet
            String s= String.valueOf(c);//again string mein convert
        
        map.putIfAbsent(s,new ArrayList<String>());//aet into map
        map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}