class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean ans=false;
        int count=0;
        if(flowerbed.length==1){
            if((flowerbed[0]==0 && n==1)|| n==0)return true;
            else return false;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(i==0 || i==flowerbed.length-1){
                if(i==0 && flowerbed[i]==0  && flowerbed[i+1]==0){
                    count++;
                    flowerbed[i]=1;
                }
                if(i==flowerbed.length-1 && flowerbed[i]==0  && flowerbed[i-1]==0){
                    count++;
                    flowerbed[i]=1;
                }
            }else{
                if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                    count++;
                    flowerbed[i]=1;
                }
            }
        }
        if(count>=n)return true;
        return ans;
    }
}