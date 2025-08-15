class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefixproduct=1;
        int suffixproduct=1;
        int maxproduct = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(prefixproduct==0){
                prefixproduct=1;
            }
            if(suffixproduct==0){
                suffixproduct=1;
            }

            prefixproduct = prefixproduct * nums[i];
            suffixproduct = suffixproduct * nums[n-i-1];

            maxproduct = Math.max(maxproduct,Math.max(prefixproduct,suffixproduct));
        }
        return maxproduct;
    }
}
