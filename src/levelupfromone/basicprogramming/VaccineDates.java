package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class VaccineDates {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] line = in.readLine().split(" ");
                int d = Integer.parseInt(line[0]);
                int l = Integer.parseInt(line[1]);
                int r = Integer.parseInt(line[2]);

                if (l <= d && d <= r)
                    System.out.println("Take second dose now");
                else if (d > r)
                    System.out.println("Too Late");
                else
                    System.out.println("Too Early");
            }
        } catch (Exception e) {
            return;
        }
    }
}
