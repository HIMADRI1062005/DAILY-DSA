class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int cnt=0;
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2;i < n; i++) {
            if (prime[i]) {
                cnt++;
                for (int j = i * 2; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna