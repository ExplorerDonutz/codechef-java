package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class HoopJump {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(in.readLine());
                System.out.println((1 + n) / 2);
            }
        } catch (Exception e) {
            return;
        }
    }
}
