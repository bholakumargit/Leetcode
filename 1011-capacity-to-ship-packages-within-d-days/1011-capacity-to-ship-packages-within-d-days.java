class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lowerBound=0;
        int upperBound=0;

        for(int w:weights){
            lowerBound = Math.max(lowerBound,w); //maximum possible weight ship can carry
            upperBound =upperBound+w; //sum of all weight
        }
        while(lowerBound<upperBound){
            int NewShipCapacity=lowerBound+(upperBound-lowerBound)/2;
            if(CheckShip(weights,days,NewShipCapacity)){
                upperBound=NewShipCapacity; //try smaller Capacity
            }else{
                lowerBound=NewShipCapacity+1; //try for big
            }    
        }
        return lowerBound;
    }
    private boolean CheckShip(int weight[],int Days, int capacity){
        int DayCount=1;
        int currentLoad=0;
        for(int w:weight){
            if(currentLoad+w > capacity){
                ++DayCount;
                currentLoad=w;
            }else{
                currentLoad=currentLoad+w;
            }

        }
        return DayCount<=Days;
    }
}