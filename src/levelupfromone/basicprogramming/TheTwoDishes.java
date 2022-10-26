package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TheTwoDishes {
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                int n = Integer.parseInt(str[0]);
                int s = Integer.parseInt(str[1]);

                if (s <= n)
                    System.out.println(s);
                else
                    System.out.println(n * 2 - s);
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
