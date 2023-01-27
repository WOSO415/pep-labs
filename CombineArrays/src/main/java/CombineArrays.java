import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
       int aLen = arr1.length;
       int bLen = arr2.length;
       int c = aLen + bLen;
       int[] arr3 = new int[c];
        System.arraycopy(arr1, 0, arr3, 0, aLen);
        System.arraycopy(arr2, 0, arr3, aLen, bLen);
        return arr3;
        

    }

}