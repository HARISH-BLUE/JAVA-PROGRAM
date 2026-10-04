public class zerofirst {
    public static void sortZeroFirst(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] == 0) {
                left++;
            }

            while (left < right && arr[right] == 1) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1};

        System.out.println("Original array:");
        printArray(arr);

        sortZeroFirst(arr);

        System.out.println("Array after arranging zeros first:");
        printArray(arr);
    }
}
