class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String word1[]=s1.split(" ");
        String word2[]=s2.split(" ");
        Map<String,Integer>map=new HashMap<>();
        for(String word:word1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:word2){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(e.getValue()==1){
                list.add(e.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}