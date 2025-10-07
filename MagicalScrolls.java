public class MagicalScrolls {
    public static void main(String[] args) {
        int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
        int target = 60;
        int[] rc = find(mat, target);
        System.out.println("(" + rc[0] + "," + rc[1] + ")"); 
    }
    static int[] find(int[][] m, int target){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
