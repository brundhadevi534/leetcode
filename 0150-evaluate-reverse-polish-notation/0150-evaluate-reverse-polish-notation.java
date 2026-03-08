class Solution {
    public int evalRPN(String[] tokens) {
int[] stack=new int[tokens.length];
    int n1=0; int n2=0;int top=-1;
        for (String ch : tokens) {
            if(ch.equals("+")){
                n2=stack[top--];
                n1=stack[top--];
                stack[++top]=(n1+n2);
            }
            else if(ch.equals("-")){
                n2=stack[top--];
                n1=stack[top--];
                stack[++top]=(n1-n2);
            }
            else if(ch.equals("*")){
                n2=stack[top--];
                n1=stack[top--];
                stack[++top]=(n1*n2);
            }
            else if(ch.equals("/")){
                n2=stack[top--];
                n1=stack[top--];
                stack[++top]=(n1/n2);
            }
            else
            stack[++top]=Integer.parseInt(ch);
        }
       return stack[top];
    }

    }
