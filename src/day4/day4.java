package day4;

import java.util.Scanner;
import java.nio.file.Paths;

public class day4 {
    public static void main(String args[]) {
        int pairs = 0;
        try (Scanner scanner = new Scanner(Paths.get("src//day4/input.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String part1 = parts[0];
                String part2 = parts[1];
                String[] range = part1.split("-");
                String[] range2 = part2.split("-");
                int min = Integer.parseInt(range[0]);
                int max = Integer.parseInt(range[1]);
                int min2 = Integer.parseInt(range2[0]);
                int max2 = Integer.parseInt(range2[1]);

                if (line.isEmpty()) {
                    break;
                } else {
                    if (min >= min2 && max <= max2) {
                        pairs += 1;
                    } else if (min2 >= min && max2 <= max) {
                        pairs += 1;
                    }
                }

            }
            System.out.println("The total number of pairs are : " + pairs);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
