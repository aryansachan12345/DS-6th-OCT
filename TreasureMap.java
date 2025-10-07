public class TreasureMap {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 5;
        System.out.println(exists(mat, target) ? "Yes" : "No"); 
    }
    static boolean exists(int[][] m, int target){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j] == target) return true;
            }
        }
        return false;
    }
}
