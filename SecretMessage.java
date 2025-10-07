import java.util.*;
public class SecretMessage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr)); // [4,3,2,1]
    }
    static void reverse(int[] a){
        int i=0,j=a.length-1;
        while(i<j){
            int t=a[i]; a[i]=a[j]; a[j]=t;
            i++; j--;
        }
    }
}
