package 栈_队列;

import java.util.Stack;

/**
 * @author wei junbin
 * @create 2021-10-11 9:08
 */
public class _739_每日温度 {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures==null||temperatures.length==0) return null;
        int[] rssult=new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int id=stack.peek();
                rssult[id]=i-id;
                stack.pop();

            }
            stack.push(i);

        }

        return rssult;
    }
}
