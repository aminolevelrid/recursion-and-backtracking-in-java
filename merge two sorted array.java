import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,3,6,9,10};
        int i = arr.length;
        int arr1[] = {2,5,8};
        int j = arr1.length;
        mergeArrays(arr, arr1, i, j);
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2) {
        int ans[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ans[k] = arr2[j];
            j++;
            k++;}

        System.out.println(Arrays.toString(ans));
    }
}