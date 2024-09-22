public class Solution {
    public int findKthNumber(int n, int k) {
        int current = 1;
        k--; 

        while (k > 0) {
            long steps = calculateSteps(n, current, current + 1);
            if (steps <= k) {
                
                current++;
                k -= steps;
            } else {

                current *= 10;
                k--;
            }
        }

        return current;
    }

    private long calculateSteps(int n, long current, long next) {
        long steps = 0;
        while (current <= n) {
            steps += Math.min(n + 1, next) - current;
            current *= 10;
            next *= 10;
        }
        return steps;
    }
}