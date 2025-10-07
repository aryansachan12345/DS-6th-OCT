import java.util.*;
public class SpiralLibrary {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(spiralOrder(mat)); 
    }
    static List<Integer> spiralOrder(int[][] m){
        List<Integer> res = new ArrayList<>();
        if(m==null || m.length==0) return res;
        int top=0, left=0, bottom=m.length-1, right=m[0].length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++) res.add(m[top][j]);
            top++;
            for(int i=top;i<=bottom;i++) res.add(m[i][right]);
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--) res.add(m[bottom][j]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--) res.add(m[i][left]);
                left++;
            }
        }
        return res;
    }
}
