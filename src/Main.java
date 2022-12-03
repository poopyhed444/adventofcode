
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    static int sum = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try (Scanner scanner = new Scanner(Paths.get("src//input.txt"))) {

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
        // part 2 solutions, remove the bottom 2 lines to get part 1 solution and ofc remove secondLargest and thirdLargest
        int secondlargest = list.stream().sorted().skip(list.size() - 2).findFirst().get();
        int thirdLargest = list.stream().sorted().skip(list.size() - 3).findFirst().get();
        System.out.println(Largest + secondlargest + thirdLargest);


    }
}

