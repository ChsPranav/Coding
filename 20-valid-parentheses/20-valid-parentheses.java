class Solution {
    public boolean isValid(String s) {
         Stack<Character>ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='{'||s.charAt(i)=='[')ans.add(s.charAt(i));
            else if(s.charAt(i)==')'){
                if(ans.isEmpty())return false;
                if(ans.peek()!='(')return false;
                else{
                 ans.pop();   
                }
                }
            else if(s.charAt(i)==']'){
                if(ans.isEmpty())return false;
                if(ans.peek()!='[')return false;
                else{
                 ans.pop();   
                }
                }
            else if(s.charAt(i)=='}'){
                if(ans.isEmpty())return false;
                if(ans.peek()!='{')return false;
                else{
                 ans.pop();   
                }
                }
        }
        boolean check=ans.isEmpty();
        if(check)return true;
        return false;
    }
}