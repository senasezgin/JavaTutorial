package JavaTutorial;

import java.util.Arrays;

public class DuplicateData {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 3,4,6,6, 2, 9, 20};
        int[] dublicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (dublicate[i] % 2 == 0) {
                        dublicate[startIndex++] = list[i];

                    }
                }
                for (int value : dublicate) {
                    if (value != 0) {
                        System.out.println(value);

                    }

                }
            }
        }
    }
}