package day1;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class day1 {

    static int sum = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try (Scanner scanner = new Scanner(Paths.get("src//day1/input.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    list.add(sum);
                    sum = 0;

                } else {
                    int calories = Integer.parseInt(line);
                    sum += calories;
                }
            }



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int Largest = list.stream().sorted().skip(list.size() - 1).findFirst().get();
            System.out.println("The largest number is: " + Largest);


        }
    }
