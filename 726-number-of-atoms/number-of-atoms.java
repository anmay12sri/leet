class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Stack<Map<String, Integer>> st = new Stack<>();
        st.push(new HashMap<>());

        int i = 0;
        while (i < n) {
            char ch = formula.charAt(i);
            if (ch == '(') {
                st.push(new HashMap<>());
                i++;
            } else if (ch == ')') {
                Map<String, Integer> top = st.pop();
                i++;
                int iStart = i;
                int multiplicity = 1;
                if (i < n && Character.isDigit(formula.charAt(i))) {
                    while (i < n && Character.isDigit(formula.charAt(i))) i++;
                    multiplicity = Integer.parseInt(formula.substring(iStart, i));
                }

                for (String key : top.keySet()) {
                    int v = top.get(key);
                    st.peek().put(key, st.peek().getOrDefault(key, 0) + v * multiplicity);
                }
            } else {
                int iStart = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(iStart, i);
                iStart = i;
                int multiplicity = 1;
                if (i < n && Character.isDigit(formula.charAt(i))) {
                    while (i < n && Character.isDigit(formula.charAt(i))) i++;
                    multiplicity = Integer.parseInt(formula.substring(iStart, i));
                }
                st.peek().put(name, st.peek().getOrDefault(name, 0) + multiplicity);
            }
        }

        TreeMap<String, Integer> result = new TreeMap<>(st.pop());
        StringBuilder sb = new StringBuilder();
        for (String key : result.keySet()) {
            sb.append(key);
            int count = result.get(key);
            if (count > 1) sb.append(count);
        }
        return sb.toString();
    }
}