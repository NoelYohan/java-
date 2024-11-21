class Solution {
    public int search(int[] nums, int target) {
        int f=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                f=1;
                k=i;
                break;
            }
        }
        if(f==1)
            return k;
        else
            return -1;
    }
}