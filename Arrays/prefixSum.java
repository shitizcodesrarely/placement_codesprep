import java.util.*;

public class prefixSum {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 6, 9};
        int[] prefixSum = new int[array.length];

        prefixSum[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        System.out.println(Arrays.toString(prefixSum));
    }
}
