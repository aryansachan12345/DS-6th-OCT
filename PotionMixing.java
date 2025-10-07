import java.util.*;
public class PotionMixing {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7};
        int target = 6;
        int[] res = twoSum(arr, target);
        System.out.println("(" + res[0] + "," + res[1] + ")"); // (1,2)
    }
    static int[] twoSum(int[] a, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int need = target - a[i];
            if(map.containsKey(need)) return new int[]{map.get(need), i};
            map.put(a[i], i);
        }
        return new int[]{-1,-1};
    }
}
