class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for ( String token:tokens){
            switch (token){
                case "+":
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
                break;
                case "-":
                int e = stack.pop();
                int f = stack.pop();
                stack.push(f-e);
                break;
                case "*":
                int g = stack.pop();
                int h = stack.pop();
                stack.push(h*g);
                break;
                case "/":
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j/i);
                break;
                default :
                int k = Integer.parseInt(token);
                stack.push(k);
                break;

            }
           
        }
        return stack.peekFirst();
        
    }
}
