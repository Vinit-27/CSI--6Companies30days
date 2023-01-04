class Solution {
    public int maxRotateFunction(int[] nums) {
        int ans[] = new int [nums.length];
        int sum,max=-99999999;
        int l=nums.length,k=l;
        for(int i=0;i<k;i++){
            sum=0;
            for(int j=0;j<k;j++){
               sum+=(j*nums[(l+j)%k]); 
            }
            l--;
            ans[i]=sum;
            if(max<ans[i])
                max=ans[i];
        }
        return max;
    }
}
