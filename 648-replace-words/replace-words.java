class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String>set=new HashSet<>(dictionary);
        String words[]=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(findRoot(word,set));
        }
        return sb.toString();

    }
    private String findRoot(String word,Set<String>set){
        for(int i=1;i<=word.length();i++){
            String prefix=word.substring(0,i);
            if(set.contains(prefix)){
             return prefix;
            }
        }
        return word;
    }
}