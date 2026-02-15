package binaryAnswers;

public class ShipPackages {
    static int shiPackages(int weights[], int days){
        int maxCap = 0, minCap = 0;
        for(int i : weights){
            maxCap += i;
            minCap = Math.max(i, minCap);
        }
        
        while(minCap<=maxCap){
            int midCap = minCap + (maxCap-minCap)/2;
            if(reqCapacity(weights, days, midCap)){
                maxCap = midCap - 1;
            }
            else minCap = midCap + 1;
        }
        return minCap;
    }
    static boolean reqCapacity(int weights[], int days,int midCap){
        int day = 1, loaded = 0;
        for(int i = 0; i < weights.length; i++){
            if( loaded + weights[i] > midCap ){
                day++;
                loaded = weights[i];
                if(day>days) return false;
            }
            else loaded += weights[i];
        }
        return day<=days;
    }
    public static void main(String[] args) {
        int weights[] = {3,2,2,4,1,4};
        int leastCap = shiPackages(weights, 3);
        System.out.println(leastCap);
    }
}
