class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
    int n1=0; int n2=0;
        for (String ch : tokens) {
            if(ch.equals("+")){
                n2=stack.pop();
                n1=stack.pop();
                stack.push(n1+n2);
            }
            else if(ch.equals("-")){
                n2=stack.pop();
                n1=stack.pop();
                stack.push(n1-n2);
            }
            else if(ch.equals("*")){
                n2=stack.pop();
                n1=stack.pop();
                stack.push(n1*n2);
            }
            else if(ch.equals("/")){
                n2=stack.pop();
                n1=stack.pop();
                stack.push(n1/n2);
            }
            else
            stack.push(Integer.parseInt(ch));
        }
       return stack.peek();

    }
}