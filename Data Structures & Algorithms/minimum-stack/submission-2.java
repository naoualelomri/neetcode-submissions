class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;
    
    public MinStack() {
        stack = new ArrayDeque<>();
        minstack= new ArrayDeque<>();
    }
    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty()){
            minstack.push(val);
        }
        else{
            minstack.push(Math.min(val,minstack.peekFirst()));
        }
    }
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    public int top() {
        return stack.peekFirst();

    }
    public int getMin() {
        return minstack.peekFirst();
    }
}
