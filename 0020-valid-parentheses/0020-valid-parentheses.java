class Solution {
    public boolean isValid(String s) {
Stack<Character> stck=new Stack<>();
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);   
     if(ch=='('|| ch=='['||ch=='{')
     stck.push(ch);
     else{
        if(stck.isEmpty())
        return false;
        char topdata=stck.pop();
        if(ch==')'&& topdata!='('|| ch==']'&& topdata!='['||ch=='}'&& topdata!='{')
        return false;
     }
}return stck.isEmpty();
    }
}