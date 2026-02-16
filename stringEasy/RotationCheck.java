package stringEasy;

public class RotationCheck {
    static boolean isRotated(String s, String goal){
        if(s.length()!=goal.length()) return false;
        String mergedStr = s + s;
        return mergedStr.contains(goal);
    }
    // it is a function for contains
    static boolean isSubstring(String mergedStr, String goal){
        for(int i = 0; i < (mergedStr.length() - goal.length()); i++){
            int currMatched = 0;
            while(currMatched < goal.length() && mergedStr.charAt(i+currMatched) == goal.charAt(currMatched)){
                currMatched++;
            }
            if(currMatched == goal.length()) return true;
        }
        return false;
    }
}
