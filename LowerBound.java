public class LowerBound {
    public static void main(String[] args) {
        int[] a = {1,2,4,6,6,8};
        System.out.println(lowerBound(a, 6)); 
        System.out.println(lowerBound(a, 5)); 
    }
    static int lowerBound(int[] a, int target){
        int l=0, r=a.length;
        while(l<r){
            int mid = l + (r-l)/2;
            if(a[mid] >= target) r = mid;
            else l = mid+1;
        }
        return l; 
    }
}
