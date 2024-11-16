class Solution {
    public int maxSubArray(int[] nums) {
        int t=0;
        int res=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            t+=nums[i];
            if(t<0)
                t=0;
            if(t>res)
                res=t;
        }
        return res;

    }
}