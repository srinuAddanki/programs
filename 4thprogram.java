class Solution {
    static int count=0;
    static String res="";
    public String getHappyString(int n, int k) {
        //ArrayList<Character> sri=new ArrayList<>();
        count=0;
        res="";
        backTrack(n,k,new StringBuilder(),' ');
        return res;
        
    }

    private static void backTrack(int n,int k,StringBuilder sb,char ch){
        if(sb.length()==n){
            if(++count==k){
                res=sb.toString();
            }
            return;
        }

        char[] chh={'a','b','c'};
        for(int i=0;i<chh.length;i++){
            char c=chh[i];
            if(c!=ch){
                sb.append(c);
                backTrack(n,k,sb,c);
                sb.setLength(sb.length()-1);
                if(!res.isEmpty()) return;
            }
        }

    }
}