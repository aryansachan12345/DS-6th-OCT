public class AncientScroll {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8};
        int key = 7;
        System.out.println(search(arr, key)); 
    }
    static int search(int[] a, int key){
        for(int i=0;i<a.length;i++) if(a[i]==key) return i;
        return -1;
    }
}
