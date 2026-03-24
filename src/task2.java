import java.util.Scanner;
public class task2 {
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }
    public static void readArray(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        readArray(arr, i + 1, sc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        readArray(arr, 0, sc);
        double avg = (double) sum(arr, n) / n;
        System.out.println(avg);
    }
}