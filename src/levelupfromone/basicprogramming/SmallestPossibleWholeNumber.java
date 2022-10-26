package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SmallestPossibleWholeNumber {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] nums = in.readLine().split(" ");
                int n = Integer.parseInt(nums[0]);
                int k = Integer.parseInt(nums[1]);
                if (k > 0)
                    System.out.println(n % k);
                else
                    System.out.println(n);
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
