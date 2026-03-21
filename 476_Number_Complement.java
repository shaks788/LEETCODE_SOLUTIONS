class Solution {
    public int findComplement(int n) {
        int mask=0;
        int complement= ~n;
        while(n!=0){
            mask=(mask<<1)|1;
            n=n>>1;
        }
        int ans= complement & mask;
        return ans;
    }