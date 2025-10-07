public class KingsParade {
    public static void main(String[] args) {
        System.out.println(isNonDecreasing(new int[]{1,3,5,7})); 
        System.out.println(isNonDecreasing(new int[]{3,2,1}));   
    }
    static boolean isNonDecreasing(int[] a){
        for(int i=1;i<a.length;i++) if(a[i] < a[i-1]) return false;
        return true;
    }
}
