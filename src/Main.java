import java.util.Arrays;

public class Main {
    static int[] list = {2,3,2,5,6,1,-2,3,14,12};
    public static void main(String[] args) {
        System.out.println("Before: " + Arrays.toString(list));
        bubbleSort(list);
        System.out.println("After: " + Arrays.toString(list));
    }
    private static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int i = 0; i < list.length - 1; i++) {
            needNextPass = false;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
