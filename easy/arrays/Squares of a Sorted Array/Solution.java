class Solution {
    public int[] sortedSquares(int[] nums) {
       
        int count = 0, x = 0;
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0)
                count ++;
            nums[i] = nums[i]*nums[i];
            
        }
       

        //merge
        int i=count-1,j=count;
        for(i=count-1,j=count;i>=0 && j<nums.length ;){
            if(i>-1 && j<nums.length && nums[i]<nums[j] ){
                res[x]=nums[i];
                i--;x++;
            }else if(j<nums.length) {
                res[x]=nums[j];
                j++;x++;
            }
            
        }
        while(x<nums.length && j<nums.length){
            res[x] = nums[j];
            x++; j++;
        }
        while(x<nums.length && i>=0){
            res[x] = nums[i];
            i--;x++;
        }
        
        return res;
    }
}
