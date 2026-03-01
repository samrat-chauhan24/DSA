package recursionJava;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    
    static List<List<Integer>> combinationSum(int candidates[], int target){
        List<List<Integer>> finalResult = new ArrayList<>();
        helpForCombination(0, candidates,target, finalResult, new ArrayList<>());
        return finalResult;
    }
    static void helpForCombination(int idx, int candidates[], int target, List<List<Integer>> finalResult, List<Integer> currList){
        // base condition
        if(idx == candidates.length){
            if(target == 0) finalResult.add(new ArrayList<>(currList));
            return;
        }
        // now pick or not
        if(candidates[idx] <= target){
            currList.add(candidates[idx]);
            helpForCombination( idx, candidates, target - candidates[idx], finalResult, currList);
            currList.remove(currList.size() - 1);
        }
        helpForCombination(idx + 1, candidates, target, finalResult, currList);
    }
}
