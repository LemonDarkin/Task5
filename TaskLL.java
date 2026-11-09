import java.util.Scanner;

public class TaskLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int petya = sc.nextInt();

        int position = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] >= petya) {
                position++;
            } else {
                break;
            }
        }

        System.out.println(position);

        sc.close();
    }
}