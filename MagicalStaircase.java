public class MagicalStaircase {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(ways(n)); 
    }
    static long ways(int n){
        if(n==0) return 1;
        long a=1, b=1; 
        for(int i=2;i<=n;i++){
            long c=a+b; a=b; b=c;
        }
        return b;
    }
}
