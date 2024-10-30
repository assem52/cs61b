import java.util.Scanner;

public class Problems {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        if (sum < 0){
            sum = Math.abs(sum);

        }
        System.out.print(sum);
    }
}