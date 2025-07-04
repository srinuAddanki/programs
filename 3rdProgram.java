class Solution {
    public char kthCharacter(int k) {
        StringBuilder sri=new StringBuilder("a");
        while(sri.length()<k){
            int n=sri.length();
            for(int i=0;i<n;i++){
                sri.append((char)('a'+(sri.charAt(i)-'a'+1)%26));   // it's little bit confusing i need to understand it.
            }
        }
        return sri.charAt(k-1); //return
        
    }
}