package bitManipulation;



public class basicsOfBit {
    static String convertToBinary(int n ){
        String res = "";
        // while(n > 0){
        //     if(n%2==1) res += "1";
        //     else res +="0";
        //     n = n/2;
        // }
        
        // better version
        while(n > 0){
            res = (n%2) + res;
            n = n/2; 
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(convertToBinary(13));
        System.out.println(convertToInteger("1101"));
        swapTwoNums(5, 6);
        System.out.println(setOrNot(13));
    }
    static int convertToInteger(String res){
        int num = 0;
        int p = 0;
        for(int i = res.length() - 1 ; i >= 0 ; i--){
            if(res.charAt(i) == '1') num += Math.powExact(2, p);
            p++;
        } 
        return num;
    }
    // swap two number
    static void swapTwoNums(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b; 
        System.out.println(a + " " + b); 
    }
    // check if the ith bit is set or not; this is brute force
    static boolean setOrNot(int n ){
        String res = "";
        while(n > 0){
            res = (n%2) + res;
            n = n/2; 
        }
        if(res.charAt(res.length() - 2 - 1) == '1') return true;
        else return false;
    }
    // optimal or can say using bit operators
    static boolean optimalSetOrNot(int n, int i){
        if( (n & (1 << i))  != 0) return true;
       
        return false;
    }
}
 