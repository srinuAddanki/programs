class Solution {
    public int numberOfBeams(String[] bank) {
        int count=0;
        List<Integer> sri=new ArrayList<>();

        for(int i=0;i<bank.length;i++){
            int r1=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    r1++;
                }
            }
            if(r1>0)
            sri.add(r1);
        }
        for(int i=1;i<sri.size();i++){
            int temp=sri.get(i-1)*sri.get(i);
            count+=temp;
        }
        return count;
    }
}