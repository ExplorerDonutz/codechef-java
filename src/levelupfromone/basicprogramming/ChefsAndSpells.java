package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefsAndSpells {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] powers = in.readLine().split(" ");
                int a = Integer.parseInt(powers[0]);
                int b = Integer.parseInt(powers[1]);
                int c = Integer.parseInt(powers[2]);

                if (a + b >= a + c && a + b >= b + c) {
                    System.out.println(a + b);
                } else {
                    System.out.println(Math.max(a + c, b + c));
                }
            }
        } catch (Exception e) {
            return;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
