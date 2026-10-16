class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> monotone_stack = new ArrayDeque<>();
        for(int i=0 ; i<temperatures.length ; i++){
            while (monotone_stack.isEmpty()== false && temperatures[i]>temperatures[monotone_stack.peekFirst()] ){
                int j= monotone_stack.pop();
                result[j]= i-j;
                
            }
            monotone_stack.push(i);

        }
        return result;
    }
}
