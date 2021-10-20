package 栈_队列;

/**
 * @author wei junbin
 * @create 2021-10-06 21:09
 */
public class MinStack {
//方法一：两个栈
    /*private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty()){
            minstack.push(val);

        }else {
            minstack.push(Math.min(val, minstack.peek()));

        }


    }


    public void pop() {
        stack.pop();
        minstack.pop();

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minstack.peek();
    }*/
    //方法二：使用链表
    private static class Node{
        public  int val;
        public int min;
        public Node nextnode;
        public Node(int val, int min, Node nextnode) {
        this.val = val;
        this.min = min;
        this.nextnode = nextnode;
        }

    }
    private Node head;
    public MinStack() {
         Node head = new Node(0, Integer.MAX_VALUE, null);

        

    }

    public void push(int val) {
        head=new Node(val, Math.min(val, head.min), head);


    }

    public void pop() {
        head=head.nextnode;
    }

    public int top() {
        return head.val;

    }

    public int getMin() {
        return head.min;

    }

}

