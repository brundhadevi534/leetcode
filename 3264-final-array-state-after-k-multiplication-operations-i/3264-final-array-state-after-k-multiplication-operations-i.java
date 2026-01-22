class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
        );
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        for (int i = 0; i < k; i++) {
            int[] curr = pq.poll();
            curr[0] = curr[0] * multiplier;
            pq.offer(curr);
        }
        int[] result = new int[nums.length];
        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            result[pair[1]] = pair[0];
        }
        return result;
    }
}