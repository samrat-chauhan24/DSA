package recursionJava;

public class RecursiveAtoi {
    static int recursvieAtoi(String s){
        // handle white spaces
        s = s.trim();
        // handle empty cases
        if(s.length()==0) return 0;
        int idxOfStr = 0;
        
        int sign = 1;
        // store the sign, first char;
        if(s.charAt(idxOfStr)=='-'){
            sign = -1;
            idxOfStr++;
        }
        else if(s.charAt(idxOfStr)=='+'){
            idxOfStr++;
        }
        // now write a help function that will recusviely check all other inedexes
        return helperAtoi(s, sign, idxOfStr, 0);
    }
    static int helperAtoi(String s, int sign, int idxOfStr, int result){
        // let's write base condition
        int n = s.length();
        if(idxOfStr >= n || !Character.isDigit(s.charAt(idxOfStr))) return result * sign;
        //!Character.isDigit(idxOfStr), this will trigger when there's is first non digit char

        //int digit = s.charAt(idxOfStr); // it will store the ascii value, it must be converted to num
        
        int digit2 = s.charAt(idxOfStr) - '0';
        // handle overFlow situtaion 
        if(result > (Integer.MAX_VALUE - digit2) / 10){
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;  
        } 
        // add digits to result;
        result = (result*10) + digit2;
        return helperAtoi(s, sign, idxOfStr+1, result);
    }
}
