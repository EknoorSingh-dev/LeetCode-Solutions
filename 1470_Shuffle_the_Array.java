class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
           arr[i+k]=nums[i];
           arr[i+k+1]=nums[n+i];
           k++;
        }
        return arr;
    }
}