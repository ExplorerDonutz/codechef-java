package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TomAndJerry1 {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                int[] tom = {Integer.parseInt(str[0]), Integer.parseInt(str[1])};
                int[] jerry = {Integer.parseInt(str[2]), Integer.parseInt(str[3])};
                int fuel = Integer.parseInt(str[4]);
                int diff = Math.abs(jerry[0] - tom[0]) + Math.abs(jerry[1] - tom[1]);
                if (fuel >= diff && (fuel - diff) % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                }
        } catch (Exception e) {
            return;
        } finally {
            assert in != null;
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}