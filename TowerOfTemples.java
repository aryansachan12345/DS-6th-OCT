import java.math.BigInteger;
public class TowerOfTemples {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(hanoiMoves(n)); 
    }
    static BigInteger hanoiMoves(int n){
        return BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);
    }
}
