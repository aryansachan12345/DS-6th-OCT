public class ArchersRange {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        System.out.println(firstOcc(arr, 2)); 
    }
    static int firstOcc(int[] a, int key){
        int l=0, r=a.length-1, ans=-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(a[mid] >= key){
                if(a[mid]==key) ans = mid;
                r = mid-1;
            } else l = mid+1;
        }
        return ans;
    }
}
