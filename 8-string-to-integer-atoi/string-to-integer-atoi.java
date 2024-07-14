class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int ans = 0;
        boolean neg = false;
        int i = 0;

        if (s.charAt(0) == '-') {
            neg = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int dig = ch - '0';

                if (ans > (Integer.MAX_VALUE - dig) / 10) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }

                ans = ans * 10 + dig;
            } else {
                break;
            }
            i++;
        }

        return neg ? -ans : ans;
    }
}
