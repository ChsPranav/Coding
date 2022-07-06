class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length())return false;
        String total=s+s;
        for(int i=0;i<total.length()-goal.length();i++){
            if(total.substring(i,i+goal.length()).equals(goal))return true;
        }
        return false;
    }
}