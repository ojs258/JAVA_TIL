package school;

import java.util.Arrays;
import java.util.Scanner;

public class IceDrink {
    public int solution() {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] graph = new int[input[0]][];

        for (int i = 0; i < input[0]; i++) {
            graph[i] = Arrays.stream(scan.next().split("")).mapToInt(Integer::parseInt).toArray();
        }



        return 0;
    }

    public static void main(String[] args) {
        IceDrink iceDrink = new IceDrink();
        int solution = iceDrink.solution();
        System.out.println("solution = " + solution);
    }
}
