public class LostSoldier {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0,1,2,4,5};
        System.out.println(findMissing(n, arr)); 
    }
    static int findMissing(int n, int[] a){
        long expected = (long)n*(n+1)/2;
        long sum = 0;
        for(int v : a) sum += v;
        return (int)(expected - sum);
    }
}
