class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        for(;i<nums.length && i<=j;){
            if(nums[i]==val){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j--;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums)+i);
        return i;
    }
}
