class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c=='{' || c=='(' || c=='['){
                stack.push(c);
            }
            if (c=='}' || c==')' || c==']'){
                if (stack.size()!=0){
                if (c=='}' && stack.peek()=='{'){
                    stack.pop();
                }else if (c==')' && stack.peek()=='('){
                    stack.pop();
                }else if (c==']' && stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
                }else{
                    return false;
                }
            }
        }
        if (stack.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
}
