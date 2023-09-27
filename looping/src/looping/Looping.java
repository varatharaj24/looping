package looping;

import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = in.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(n + "answer" + ans);

    }

}
