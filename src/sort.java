import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,8,6,12,600,467,4,802};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSortByDigit(int[] arr, int exp)
    {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int num : arr)
        {
            int digit = (num / exp) % 10;
            count[digit]++;
        }
        for(int i = 1; i < n; i++)
        {
            count[i] = count[i] + count[i - 1];
        }
        for(int i = n - 1; i >= 0; i--)
        {
            int value = (arr[i] / exp) % 10;
            int index = count[value] - 1;
            output[index] = arr[i];
            count[value]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void radixSort(int[] arr)
    {
        int max = 0;
        for(int num : arr)
        {
            if(num > max) max = num;
        }
        for(int exp = 1; max / exp > 0; exp *= 10)
        {
            countingSortByDigit(arr, exp);
        }
    }
}
