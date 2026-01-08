class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0; //Using a pointer to keep track of non-zero elements

        for(int num:nums){
            if(num!=0){   //swaping non-zero element in front if found
                int temp = num;
                num = nums[k];
                nums[k] = temp; 
                k++; //moving pointer k forward to the next position 
            }
        }

        while(k<nums.length){
            nums[k++] = 0;
        }
    }
}
