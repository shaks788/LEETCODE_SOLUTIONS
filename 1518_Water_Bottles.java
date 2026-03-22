class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;

        for(;numBottles>=numExchange;res++){
            numBottles-=(numExchange-1);
        }

        return res;
    }
}
