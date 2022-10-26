package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TurnIt {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                int u = Integer.parseInt(str[0]);
                int v = Integer.parseInt(str[1]);
                int a = -Integer.parseInt(str[2]);
                int s = Integer.parseInt(str[3]);

                if (u == v)
                    System.out.println("YES");
                else if (v * v >= (u * u) + (2 * a * s))
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
