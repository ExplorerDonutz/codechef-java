package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TwoDishes {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] line = in.readLine().split(" ");
                int n = Integer.parseInt(line[0]);
                int a = Integer.parseInt(line[1]);
                int b = Integer.parseInt(line[2]);
                int c = Integer.parseInt(line[3]);

                while (n != 0) {
                    if (a > 0 && b > 0) {
                        a--;
                        b--;
                        n--;
                    } else if (b > 0 && c > 0) {
                        b--;
                        c--;
                        n--;
                    } else {
                        break;
                    }
                }
                System.out.println(n == 0 ? "YES" : "NO");
            }
        } catch (Exception e) {
            return;
        }
    }
}