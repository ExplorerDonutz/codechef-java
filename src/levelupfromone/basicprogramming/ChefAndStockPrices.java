package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndStockPrices {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                float s = Integer.parseInt(str[0]);
                int a = Integer.parseInt(str[1]);
                int b = Integer.parseInt(str[2]);
                int c = Integer.parseInt(str[3]);

                if (a <= s + ((s/100) * c) && s + ((s/100) * c) <= b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
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