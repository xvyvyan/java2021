package 栈_队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wei junbin
 * @create 2021-10-07 21:24
 */
public class _239_滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) return null;
        if (k == 1) return nums;
        int[] maxes = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            int w = i - k + 1;
            if (w < 0) continue;
            if (deque.peekFirst() < w) {
                deque.removeFirst();
            }
            maxes[w] = nums[deque.peekFirst()];
        }
        return maxes;
    }
}
