package levelupfromone.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class MakeAllEqualUsingPairs {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(in.readLine());
                String[] str = in.readLine().split(" ");
                int[] a = new int[str.length];

                for (int j = 0; j < str.length; j++) {
                    a[j] = Integer.parseInt(str[j]);
                }

                Arrays.sort(a);

                int count = 0;
                int prev = 0;

                for (int j = 0; j < n - 1; j++) {
                    if (a[j] == a[j + 1]) {
                        count++;
                    } else {
                        if (count > prev) {
                            prev = count;
                        }
                        count = 0;
                    }
                }
                if (a[n - 2] == a[n - 1]) {
                    if (count > prev) {
                        prev = count;
                    }
                }

                if (count == n - 1) {
                    System.out.println("0");
                } else if (n % 2 == 0) {
                    System.out.println(n - (prev + 1));
                } else {
                    System.out.println((n - prev) - 1);
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