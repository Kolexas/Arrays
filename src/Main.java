import java.util.Arrays;
public class Main {
    // Задание 1
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        String[] arr3 = {"a", "b", "v"};

        // Задание 2

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        // Задание 3
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[0]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[0]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[0]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        // Задание 4

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}