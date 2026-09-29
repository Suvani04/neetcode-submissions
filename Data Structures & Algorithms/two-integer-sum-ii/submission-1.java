class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // for(int i=0; i<numbers.length-1;i++){
        //     for(int j=i+1; j<numbers.length;j++){
        //         if(numbers[i]+numbers[j] == target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[0];
        int l=0;
        int r= numbers.length-1;

        while(l<r){
            int curSum= numbers[l]+numbers[r];
            if(curSum > target){
                r--;
            }
            else if(curSum< target){
                l++;
            }
            else{
                return new int[] {l+1,r+1};
            }
        }
        return new int[0];
    }
}
