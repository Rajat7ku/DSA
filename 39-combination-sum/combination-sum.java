class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // create the result list to store the combination sum
        List<List<Integer>> result = new ArrayList<>();

        //create the temporary List

        List<Integer> currList = new ArrayList<>();

        // execute the function

        helper(0, candidates, target, currList, result);

        return result; 
    }

    private void helper(int i, int candidates[], int target, List<Integer> currList, List<List<Integer>> result ){

        // base execution 
        if(target < 0 || i == candidates.length){
            return;
        }

        if(target == 0 ){
            // create new copy to currList 
            result.add(new ArrayList<>(currList));
            return;
        }

        // condition 1 
        // picup one by one candidates
        currList.add(candidates[i]);
        // next call to 'i' but index is same
        helper(i, candidates, target - candidates[i], currList, result);

        // backtracking process
        currList.remove(currList.size() -1);

        // condition 2
        // change the candidates but target is same
        helper(i+1, candidates, target, currList, result);
    }
}