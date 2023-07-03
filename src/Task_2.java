import java.io.PrintWriter;

public class Task_2 {
    static void bubble(int[] array, PrintWriter printWriter) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            printArray(array, printWriter);

            if (!swapped) {
                break;
            }
        }
    }

    private static void printArray(int[] array, PrintWriter printWriter) {
        for (int num : array) {
            printWriter.print(num + " ");
        }
        printWriter.println();
    }
}
