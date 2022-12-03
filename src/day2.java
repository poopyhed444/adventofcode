import java.nio.file.Paths;
import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        int counter = 0;
        try (Scanner scanner = new Scanner(Paths.get("src//input2.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                } else {
                    // replace the bottom code with this to get part 1 solution
                    //                    if (line.contains("A") && line.contains("Y")) {
                    //                       counter = counter + 8;
                    //                    }
                    //                }   if (line.contains("A") && line.contains("X")){
                    //                       counter = counter + 4;
                    //
                    //                }
                    //                if (line.contains("A") && line.contains("Z")) {
                    //                    counter = counter + 3;
                    //                }
                    //                if (line.contains("B") && line.contains("Y")) {
                    //                    counter = counter + 5;
                    //                }
                    //                if (line.contains("B") && line.contains("X")) {
                    //                    counter = counter + 1;
                    //
                    //                }
                    //                if (line.contains("B") && line.contains("Z")) {
                    //                    counter = counter + 9;
                    //                }
                    //                if (line.contains("C") && line.contains("Y")) {
                    //                    counter = counter + 2;
                    //                }
                    //                if (line.contains("C") && line.contains("X")) {
                    //                    counter = counter + 7;
                    //
                    //                }
                    //                if (line.contains("C") && line.contains("Z")) {
                    //                    counter = counter + 6;
                    //                }
                    // part 2 solution below
                   if (line.contains("A") && line.contains("Y")) {
                       counter = counter + 4;
                    }
                }   if (line.contains("A") && line.contains("X")){
                       counter = counter + 3;

                }
                if (line.contains("A") && line.contains("Z")) {
                    counter = counter + 8;
                }
                if (line.contains("B") && line.contains("Y")) {
                    counter = counter + 5;
                }
                if (line.contains("B") && line.contains("X")) {
                    counter = counter + 1;

                }
                if (line.contains("B") && line.contains("Z")) {
                    counter = counter + 9;
                }
                if (line.contains("C") && line.contains("Y")) {
                    counter = counter + 6;
                }
                if (line.contains("C") && line.contains("X")) {
                    counter = counter + 2;

                }
                if (line.contains("C") && line.contains("Z")) {
                    counter = counter + 7;
                }

            }
            System.out.println("The total is: " + counter);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
