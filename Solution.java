class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
            List<List<Integer>> sri =new ArrayList<>();
            int n=0;
        for(int i=0;i<nums.length;i++){
           
                List<Integer> temp=new ArrayList<>();
                for(int j=i;j<nums.length;j++){

                    if(!temp.contains(nums[j])&&nums[j]!=-1){
                        temp.add(nums[j]);
                        nums[j]=-1;
                        n++;;
                    }
                }
                sri.add(temp);
                if(n==nums.length)
                break;

        }
        return sri;
    }
}