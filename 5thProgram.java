class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> sri=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sri.put(arr[i],sri.getOrDefault(arr[i],0)+1);
        }
        int big=-1;
        for(int k: sri.keySet()){
            int m=sri.get(k);
            if(m==k)
            {
                if(big<m){
                    big=m;
                }
            }
        }
        return big;
    }
}