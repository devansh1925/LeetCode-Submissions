class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int element1=0;
        int element2=0;

        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2!=nums[i]){
                element1=nums[i];
            }
            else if(count2==0 && element1!=nums[i]){
                element2=nums[i];
            }

            if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]==element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1){
                count1++;
            }
            if(nums[i]==element2){
                count2++;
            }
        }
        int min = (int)nums.length/3;
        if(count1>min){
            list.add(element1);
        }
        if(count2>min){
            if(!(list.contains(element2))){
                list.add(element2);
            }
        }

        return list;
    }
}
