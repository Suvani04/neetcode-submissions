class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] ans = new int[nums.length];
        // for(int i=0; i<nums.length;i++){
        //     // nums[i]* nums[i];
        //     ans[i]= nums[i]*nums[i];
        // }
        // Arrays.sort(ans);
        // return ans;

        int l=0;
        int r=nums.length-1;

        int[] ans = new int[nums.length];
        int k= nums.length-1;

        while(l<= r){
            int ls= nums[l]*nums[l];
            int rs = nums[r]*nums[r];

            if(ls>rs){
                ans[k]= ls;
                l++;
            }else{
                ans[k]=rs;
                r--;
            }
            k--;
        }
        return ans;
    }

}