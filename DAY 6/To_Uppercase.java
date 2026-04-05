public class To_Uppercase {
    public static void main(String[] args){
        String str="hEllO wOrld";
        char[] s=str.toCharArray();
        for(int i=0;i<s.length;i++){
            s[i]=(char)s[i-32];
        }
        System.out.println(new String(s));
    }
}