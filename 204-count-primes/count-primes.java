class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int cont=0;
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2;i < n; i++) {
            if (prime[i]) {
                cont++;
                for (int j = i * 2; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return cont;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna