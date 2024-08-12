import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> maxheap;
    private PriorityQueue<Integer> minheap;

    public MedianFinder() {
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap = new PriorityQueue<>();
    }

    public void addnum(int num) {
        maxheap.offer(num);
        minheap.offer(maxheap.poll());

        if (maxheap.size() < minheap.size()) {
            maxheap.offer(minheap.poll());
        }
    }

    public double findmedian() {
        if (maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek()) / 2.0;
        } else {
            return maxheap.peek();

        }
    }
}

public class sortingquest19 {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addnum(1);
        medianFinder.addnum(2);
        System.out.println("Median: "+medianFinder.findmedian());
        medianFinder.addnum(3);
        System.out.println("Median: "+ medianFinder.findmedian());
    }
}
