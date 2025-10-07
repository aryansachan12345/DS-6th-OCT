public class HiddenChamber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumRec(arr, arr.length)); 
    }
    static int sumRec(int[] a, int n){
        if(n==0) return 0;
        return a[n-1] + sumRec(a, n-1);
    }
}
