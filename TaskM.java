import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        // Первый переворот
        for (int i = A - 1; i < (A + B) / 2; i++) {
            int temp = a[i];
            a[i] = a[A + B - 2 - i];
            a[A + B - 2 - i] = temp;
        }

        // Второй переворот
        for (int i = C - 1; i < (C + D) / 2; i++) {
            int temp = a[i];
            a[i] = a[C + D - 2 - i];
            a[C + D - 2 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}