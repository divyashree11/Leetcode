class Solution {
    public int findNumbers(int[] nums) {
        int count = 1;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            count = 1;
            while(nums[i]/10!=0){
                nums[i] = nums[i]/10;
                count ++;
            }
            
            if(count%2==0){
                result++;
            }
        }
        return result;
    }
}
