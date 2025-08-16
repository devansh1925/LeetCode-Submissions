class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left=0;
        int right=0;
        int maxlen=0;
        int[] arr = new int[256];
        for(int i=0;i<256;i++){
            arr[i]=-1;
        }

        while(right<n){
            
            if(arr[s.charAt(right)]==-1 || arr[s.charAt(right)]<left){
                maxlen = Math.max(maxlen,right-left+1);
                arr[s.charAt(right)] = right;
            }
            else{
                int position = arr[s.charAt(right)];
                arr[s.charAt(right)] = right;
                left=position+1;
                
            }
            right++;
        }

        return maxlen;
    }
}