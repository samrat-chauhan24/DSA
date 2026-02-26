package recursionJava;

public class RecursiveAtoi {
    static int recursiveAtoi(String s){
        s = s.trim();// eliminated whitespaces
        if(s.length()==0) return 0;
        
        int sign = 1, idx = 0;
        if(s.charAt(0)=='-'){
            sign = -1;
            idx++;
        }
        else if(s.charAt(0)=='+') idx ++;

        return helperForRecursion(s, 0, idx, sign);
    }

    static int helperForRecursion(String s, int result, int idx, int sign){ 
        int n  = s.length();
        if(idx>=n || !Character.isDigit(s.charAt(idx))) return result * sign;

        int digit = s.charAt(idx) - '0';
        // overflow condition
        if(result > (Integer.MAX_VALUE - digit) / 10){
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return helperForRecursion(s, result*10 + digit, idx+1, sign);
    }
}
