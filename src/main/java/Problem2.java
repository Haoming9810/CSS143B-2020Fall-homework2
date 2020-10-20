
public class Problem2 {

    /*
      remove duplicate elements and return new size of modified array
      Create an auxiliary array temp[] to store unique elements.
      Traverse input array and one by one copy unique elements of arr[] to temp[].
      Also keep track of count of unique elements. Let this count be j.
      Copy j elements from temp[] to arr[] and return j
     */


    public static int remove(int[] nums) {

        if (nums.length==0 || nums.length==1)
            return nums.length;

        int[] temp = new int[nums.length];
        int j = 0;
        for (int i=0; i<nums.length-1; i++)

            if (nums[i] != nums[i+1])
                temp[j++] = nums[i];


        temp[j++] = nums[nums.length-1];


        for (int i=0; i<j; i++)
            nums[i] = temp[i];

        return j;


    }
}


