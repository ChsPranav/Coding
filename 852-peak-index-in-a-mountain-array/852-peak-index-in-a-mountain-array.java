class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int low=0,high=arr.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if( mid!=0 && mid!=arr.length-1 && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])return mid;
            else if(mid==arr.length-1){
                if(arr[mid-1]<arr[mid])return mid;
            }
            else if(mid==0){
                if(arr[mid]>arr[mid+1])return mid;
            }
            else if(arr[mid]>arr[mid-1])low=mid+1;
            else high=mid;
        }
        return 0;
    }
}