public class TreasureIsland {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int bestRow = maxRow(mat);
        System.out.println("Row " + bestRow + " (sum=" + rowSum(mat, bestRow) + ")"); 
    }
    static int maxRow(int[][] m){
        int best = 0, bestSum = Integer.MIN_VALUE;
        for(int i=0;i<m.length;i++){
            int s = 0;
            for(int v: m[i]) s += v;
            if(s > bestSum){ bestSum = s; best = i; }
        }
        return best;
    }
    static int rowSum(int[][] m, int r){ int s=0; for(int v:m[r]) s+=v; return s; }
}
