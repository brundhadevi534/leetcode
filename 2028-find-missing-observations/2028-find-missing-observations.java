class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
                int m = rolls.length;
        int knownSum = 0;
        for (int r : rolls) {
            knownSum += r;
        }
        int totalSum = mean * (n + m);
        int missingSum = totalSum - knownSum;
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0]; // Not possible
        }
        int[] result = new int[n];
        int remaining = missingSum;
        for (int i = 0; i < n; i++) {
            int value = Math.min(6, remaining - (n - i - 1));
            result[i] = value;
            remaining -= value;
        }
        return result;
    }
}