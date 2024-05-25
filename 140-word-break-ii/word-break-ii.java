class Solution {
    List<String> list = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> str = new ArrayList<>();
        helper(s,str,wordDict,0);

        return list;
    }
    public void helper(String s,List<String> str ,List<String> wordDict, int index) {
        if (index == s.length()) {
            list.add(makeString(str));
            return;
        }
        for (int i = index;i<s.length();i++) {
            if(isValid(s.substring(index,i+1),wordDict)) {
                str.add(s.substring(index,i+1));
                helper(s,str,wordDict,i+1);
                str.remove(str.size()-1);
            }
        }
    }
    public boolean isValid (String s, List<String> wordDict ) {
        if (!wordDict.contains(s)) {
            return false;
        }
        return true;
    }
    public String makeString (List<String> str) {
        if(str.size() == 0) {
            return "";
        }
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<str.size()-1;i++){
            temp.append(str.get(i));
            temp.append(" ");
        }
        temp.append(str.get(str.size()-1));
        return new String(temp);
    }
}