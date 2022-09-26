class Solution {
    public int[] plusOne(int[] digits) {
        int check=1;
        for(int i=digits.length-1;i>0;i--){
            int temp=digits[i]+check;
            digits[i]=temp%10;
            check=temp/10;
        }
        if(check==1 && digits[0]==9){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            arr[1]=0;
            for(int i=1;i<digits.length;i++)arr[i+1]=digits[i];
            return arr;
        }else{
            digits[0]+=check;
        }
        return digits;
    }
}