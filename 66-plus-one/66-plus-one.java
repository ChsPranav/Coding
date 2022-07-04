class Solution {
    public int[] plusOne(int[] digits) {
        int temp=digits[digits.length -1];
        if(temp!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
        }else{
            if(digits.length!=1){
                digits[digits.length-1]=0;
                // digits[digits.length-2]+=1;
                return check(digits,2);
            }
            else{
                int[] arr=new int[2];
                arr[0]=1;
                arr[1]=0;
                return arr;
            }
        }
        return digits;
    }
    public static int[] check(int[]digits,int pos){
        System.out.println(pos);
        if(digits.length==pos){
            if(digits[0]==9){
                int[] arr=new int[digits.length+1];
            arr[0]=1;
            arr[1]=0;
            for(int i=1;i<digits.length;i++){
                arr[i+1]=digits[i];
            }
            return arr;
            }
            else{
                digits[0]+=1;
                return digits;
            }
            
        }
        else{
            if(digits[digits.length-pos]==9){
                //System.out.println("true");
                digits[digits.length-pos]=0;
                return check(digits,++pos);
            }
            else{
                digits[digits.length-pos]+=1;
                return digits;
            }
        }
    }
}