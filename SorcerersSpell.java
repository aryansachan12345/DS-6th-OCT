public class SorcerersSpell {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseRec(s)); 
    }
    static String reverseRec(String s){
        if(s.length()<=1) return s;
        return reverseRec(s.substring(1)) + s.charAt(0);
    }
}
