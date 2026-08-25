class Solution {
    public int findMin(int[] nums) {
    //     int high=nums.length-1;
    //     int low=0;

    //     while(low<high){
    //        int med=(low+high)/2;

    //         if(nums[med]>nums[high]){
    //             low=med+1;
    //         }
    //         else{
    //             low=med;
    //         }
    //     }
    //     return nums[low];
    
    // }
    Arrays.sort(nums);
    return nums[0];
}
}