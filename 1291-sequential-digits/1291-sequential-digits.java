class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer>ans=new ArrayList<Integer>();
        String digits="123456789";
        for(int i=1;i<=9;i++){
            for (int j=0;j<=digits.length()-i;j++){
                String substr=digits.substring(j,j+i);
                int value=Integer.parseInt(substr);
                if(value>=low && value<=high)ans.add(value);
            }
        }
        return ans;
    }
}