class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nge = new int[10001];
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int temp = nums2[i];

            while(!stack.isEmpty() && temp>=stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                nge[nums2[i]]=-1;
            }
            else{
                nge[nums2[i]]=stack.peek();
            }

            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = nge[nums1[i]];
        }

        return nums1;
    }
}