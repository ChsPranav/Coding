public class Solution {
        public void moveZeroes(int[] nums) {
        
        int zeroCount=0;
        
		// We are counting the number of zeroes to see how many vacant spaces will be created by removing starting zeroes and then shifting non-zero elements to the left by that many indexes
		
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
            }else{
                nums[i-zeroCount] = nums[i];
            }
        }
		
		// Changing the last "zeroCount" number of indexes to zero 
		
        for(int j = nums.length-1; j > nums.length-1-zeroCount; j--) {
            nums[j] = 0;
        }
        
    }
}