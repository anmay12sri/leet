class Solution {
    public String sortVowels(String s) {
        List<Character>vowellist=new ArrayList<>();
        List<Integer>vowelposition=new ArrayList<>();
        for(int i=0;i<s.length();i++){
             char c=s.charAt(i);
             if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowellist.add(c);
                vowelposition.add(i);
             }
        }
        Collections.sort(vowellist);
        
        char []res=s.toCharArray();

        for(int i=0;i<vowelposition.size();i++){
            res[vowelposition.get(i)]=vowellist.get(i);
        }
        return new String(res);
    }
}