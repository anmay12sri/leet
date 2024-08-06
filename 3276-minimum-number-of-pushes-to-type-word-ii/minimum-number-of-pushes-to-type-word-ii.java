class Solution {
    public int minimumPushes(String word) {
        int count = 0;

        char[] arr = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char c : arr){
            map.put(c , map.getOrDefault(c,0) + 1);
        }

        List<Integer> l = new ArrayList<>(map.values());
        Collections.sort(l);

        int idx = 0;
        int mul = 1;
        for(int i=l.size()-1;i>=0;i--){
            if(idx == 8){
                mul++;
                idx = 0;
            }
            count += mul*l.get(i);
            idx++;
        }
        return count;
    }
}