package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ProblemCategory {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                int x = Integer.parseInt(in.readLine());
                if (1 <= x && x < 100) {
                    System.out.println("Easy");
                } else if (100 <= x && x < 200) {
                    System.out.println("Medium");
                } else if (200 <= x && x <= 300) {
                    System.out.println("Hard");
                }
            }

            in.close();
        } catch (Exception e) {
            return;
        }
    }
}
