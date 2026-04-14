class Solution {
    public String convert(String s, int n) {
        if(n==1) return s;
        String res="";
        int diff=(n-1)*2;
        for(int i=0;i<n;i++){
            for(int j=i;j<s.length();j+=diff){
                res+= s.charAt(j);
                int between= j+diff-2*i;
                if(i!=0 && i!=n-1 && between<s.length()){
                    res+= s.charAt(between);
                }
            }
        }
        return res;
    }
}
