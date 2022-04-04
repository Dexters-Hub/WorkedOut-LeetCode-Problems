class MedianFinder {
    PriorityQueue<Integer> maxHeap, minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b.compareTo(a));
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (num > findMedian()) {
            minHeap.offer(num);
        } else {
            maxHeap.offer(num);
        }
        if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.offer(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.isEmpty() && minHeap.isEmpty()) {
            return 0;
        }

        if (maxHeap.size() == minHeap.size()) {
            return ((double)maxHeap.peek() + (double)minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */