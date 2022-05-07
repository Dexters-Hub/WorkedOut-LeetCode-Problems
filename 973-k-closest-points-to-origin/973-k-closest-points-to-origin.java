class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] * a[0] + a[1] * a[1] - (b[0] * b[0] + b[1] * b[1]);
            }
        });
        for (int[] point : points) {
            pq.offer(point);
        }

        int[][] rst = new int[K][2];
        for (int i = 0; i < K; i++) {
            int[] point = pq.poll();
            rst[i][0] = point[0];
            rst[i][1] = point[1];
        }
        return rst;
    }
}