package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WeightBalance {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                int w1 = Integer.parseInt(str[0]);
                int w2 = Integer.parseInt(str[1]);
                int x1 = Integer.parseInt(str[2]);
                int x2 = Integer.parseInt(str[3]);
                int m = Integer.parseInt(str[4]);

                if (x1 * m <= w2 - w1 && w2 - w1 <= x2 * m)
                    System.out.println(1);
                else
                    System.out.println(0);
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
