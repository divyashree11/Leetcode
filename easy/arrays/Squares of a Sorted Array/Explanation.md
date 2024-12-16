Time - O(n) Beats 100%
Soultion :
1) Square all the numbers and assign count variable where -ve to +ve number change is happening. 
Example: nums [-2,-3,4,9,8] here count=2
Example: [2,3,5,7] count=0
Example: [-2,-5,-9,-88]  count=4

2) Merge the squared elements like merge sort where count is the partition. 

3) Merge the remaining elements of left and right of the count.

Pattern : Recognise the pattern where sorting is required of 2 sorted arrays as mentioned in problem elements are already sorted but squaring them it splits into 2 set of sorted arrays
