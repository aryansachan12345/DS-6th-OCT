public class KingsFeast {
    public static void main(String[] args) {
        int[] arr = {2,7,1,9,5};
        System.out.println(maxElement(arr)); 
    }
    static int maxElement(int[] a){
        int mx = a[0];
        for(int v : a) if(v > mx) mx = v;
        return mx;
    }
}
