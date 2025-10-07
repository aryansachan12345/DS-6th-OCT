public class RoyalDiagonal {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        int n = m.length;
        int mainDiag=0, antiDiag=0;
        for(int i=0;i<n;i++){
            mainDiag += m[i][i];
            antiDiag += m[i][n-1-i];
        }
        System.out.println("Main = " + mainDiag + ", Anti = " + antiDiag); // 15, 15
    }
}
