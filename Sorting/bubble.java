package Sorting;

import java.util.Scanner;

class bubble {
    static void bubblesort(int arr[], int a) {
        boolean swapped;
        for (int i = 0; i < a; i++) {
            swapped = false;
            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}