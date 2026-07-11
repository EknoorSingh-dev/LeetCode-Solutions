class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> arr = new ArrayList<>();
        int mx=Integer.MIN_VALUE;
        
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > mx) {
             mx = candies[i];
    }
}
        for(int i=0;i<candies.length;i++){
            if(candies[i]+ extraCandies>=mx){
                arr.add(true);
            }
            else{
            arr.add(false);
        }}
        return arr;
    }
}