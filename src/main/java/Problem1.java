public class Problem1 {

    /*
    program to sort an array of 0, 1 and 2
    Keep this set of data with three points low = 1, mid = 1 and high = N
    If the element is zero, low plus one, mid plus one
    If the element is 1, mid + 1
    If the element is 2, high - 1, I - 1

     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int [] num) {


        int lo = 0;
        int hi = num.length - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (num[mid]) {
                case 0: {
                    temp = num[lo];
                    num[lo] = num[mid];
                    num[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = num[mid];
                    num[mid] = num[hi];
                    num[hi] = temp;
                    hi--;
                    break;
                }
            }
        }


    }


}
