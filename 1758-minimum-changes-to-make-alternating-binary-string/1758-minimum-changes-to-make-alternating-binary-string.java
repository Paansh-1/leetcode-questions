class Solution {
    public int minOperations(String s) {
        int n = s.length();
        String s1 ="",s2="";
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='1') c2++;
                else c1++;
            } else {
                if(s.charAt(i)=='0') c2++;
                else c1++;
            }
        }
        return Math.min(c1,c2);
    }
}