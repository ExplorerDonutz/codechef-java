package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaximumLengthEvenSubarray {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                int m = Integer.parseInt(in.readLine());
                int sum = 0;
                for (int j = 1; j <=m; j++) {
                    sum += j;
                }

                if (sum % 2 == 0)
                    System.out.println(m);
                else
                    System.out.println(m - 1);
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