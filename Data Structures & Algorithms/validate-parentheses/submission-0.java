class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if (s.length()%2!=0){
            return false;
        }
        for (char c : s.toCharArray()){
            if (c =='(' || c =='[' || c=='{'){
                stack.push(c);
            } 
            else if (stack.isEmpty()){
                return false;
            }
            else{
                char top = stack.pop();
                if ((c==')' && top!='(') ||(c==']' && top!='[') ||                (c=='}' && top!='{') ){
                    return false;
                }
            }
        }

      return stack.isEmpty();  
    }
}
