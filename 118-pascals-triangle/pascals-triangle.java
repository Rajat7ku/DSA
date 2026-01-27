class Solution {
    public List<List<Integer>> generate(int numRows) {

     List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        };

        List<Integer> prev= new ArrayList<>();
        prev.add(1);

        result.add(new ArrayList<>(prev));
        for(int row =1; row <numRows; row++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for(int col = 1; col<row; col++){
                int value = prev.get(col-1) + prev.get(col);
                curr.add(value);
            }

            curr.add(1);
            result.add(curr);
            prev = curr;
        }
        return result;
        
    }
}