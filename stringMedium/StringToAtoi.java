package stringMedium;

public class StringToAtoi {
    static int myAtoi(String s){
        int i = 0, n = s.length();
        // whitespaces
        while(i<n && s.charAt(i) == ' ') i++;
        if(i==n) return 0;
        
        // check sign
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+') i++;

        // now convert digits
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = (result*10) + digit;
            i++;

        }
        return sign * result;
    }
}
