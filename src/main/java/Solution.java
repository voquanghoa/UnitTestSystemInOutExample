import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }

        long sum = 0;
        long min = array[0];
        long max = array[0];
        for(int i=0;i<n;i++){
            sum += array[i];
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }

        System.out.printf("Sum = %d, min = %d, max = %d", sum, min, max);
    }

}
