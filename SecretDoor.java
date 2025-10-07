public class SecretDoor {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(binarySearch(arr, 7)); 
    }
    static int binarySearch(int[] a, int key){
        int l=0, r=a.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(a[mid]==key) return mid;
            else if(a[mid] < key) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
}
