package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Motivation {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            byte t = Byte.parseByte(in.readLine());
            for (int i = 0; i < t; i++) {
                int best = -1;
                String[] str = in.readLine().split(" ");
                int n = Integer.parseInt(str[0]);
                int x = Integer.parseInt(str[1]);

                for (int j = 0; j < n; j++) {
                    str = in.readLine().split(" ");
                    int s = Integer.parseInt(str[0]);
                    int r = Integer.parseInt(str[1]);
                    if (s <= x) {
                        if (r > best) {
                            best = r;
                        }
                    }
                }
                System.out.println(best);
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
