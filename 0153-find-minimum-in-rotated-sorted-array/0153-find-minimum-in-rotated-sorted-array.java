class Solution {
    public int findMin(int[] nums) {
        int high=nums.length-1;
        int low=0;

        while(low<high){
           int med=low+(high-low)/2;

            if(nums[med]>=nums[high]){
                low=med+1;
            }
            else{
               high=med;
            }
        }
        return nums[low];
    
    }
   
}
