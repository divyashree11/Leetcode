class Solution2 {
    public int removeElement(int[] nums, int val) {
        
		 int count =0;
		 for(int i=0;i<nums.length-count;i++) {
			 if(nums[i]==val) {
				 for(int j=i;j<nums.length-count-1;j++) {
					 nums[j] = nums[j+1];
				 }
				 i--;
				 count++;
				 continue;
			 }
		 }
		 //System.out.println(Arrays.toString(nums));
		return nums.length-count;
	        
	    
	        
	    
    }
}
