public class DragonsRoar {
    public static void main(String[] args) {
        int n = 5;
        print1ToN(n); 
    }
    static void print1ToN(int n){
        if(n==0) return;
        print1ToN(n-1);
        System.out.print(n + (n==n? (n==0? "":" ") : " "));
    }
}
