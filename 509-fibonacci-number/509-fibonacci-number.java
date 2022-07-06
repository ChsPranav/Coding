class Solution {
    public int fib(int n) {
        int prev=0;
        int curr=1;
        int temp=0;
        int i=1;
        if(n==1)return 1;
        while(i<n){
            temp=curr+prev;
            prev=curr;
            curr=temp;
            i++;
        }
        return temp;
    }
}