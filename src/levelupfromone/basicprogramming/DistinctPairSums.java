package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DistinctPairSums {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                int l = Integer.parseInt(str[0]);
                int r = Integer.parseInt(str[1]);

                if (l == r)
                    System.out.println(1);
                else
                    System.out.println(2 * (r - l) + 1);
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