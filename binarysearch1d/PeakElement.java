package binarysearch1d;

public class PeakElement {
    static int findPeak(int[] arr) {
    int l = 0, r = arr.length - 1;

    while (l < r) {
        int mid = l + (r - l) / 2;

        if (arr[mid] < arr[mid + 1]) {
            l = mid + 1; // search right side  
        } else {
            r = mid;// search lefty
        }
    }

    return l; 

}
}
