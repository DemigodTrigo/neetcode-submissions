class Solution {
    public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();   

    Map<Character , Character> value = new HashMap<>();

    value.put(')', '(');
    value.put(']', '[');
    value.put('}', '{');

    for(char c : s.toCharArray()){

    if(value.containsKey(c)){
        if(!stack.isEmpty() && stack.peek() == value.get(c)){
            stack.pop();
        }else{
            return false;
        }
    }else{
        stack.push(c);
    }

    }

    return stack.isEmpty();
    
    }
}
