public class FarmersBasket {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println(search(arr, 25)); 
    }
    static int search(int[] a, int key){
        for(int i=0;i<a.length;i++) if(a[i]==key) return i;
        return -1;
    }
}
