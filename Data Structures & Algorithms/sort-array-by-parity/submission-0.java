class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int[] ans= new int[nums.length];

        int l=0;
        int r=nums.length-1;

        while(l<r){
            if(nums[l] % 2==0){
                l++;
            }
            else if(nums[r] % 2 !=0 ){
                // ans=nums[r];
                r--;
            }
            else{
                int temp= nums[l];
                nums[l]= nums[r];
                nums[r]=temp;

                l++;
                r--;
            }
        }
        return nums;
    }
}