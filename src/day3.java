import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.nio.file.Paths;


public class day3 {

    public static void main(String[] args) {
        int position = 0;
        try (Scanner scanner = new Scanner(Paths.get("src//day3.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                } else {


                    int length = line.length();
                    int split = length / 2;
                    String first = line.substring(0, split);
                    String second = line.substring(split);
                    Set<String> firset = new HashSet<>();
                    Set<String> secset = new HashSet<>();
                    for (int i = 0; i < first.length(); i++) {
                        firset.add(first.substring(i, i + 1));
                    }
                    for (int i = 0; i < second.length(); i++) {
                        secset.add(second.substring(i, i + 1));
                    }
                    firset.retainAll(secset);
                    Iterator<String> iterator = firset.iterator();
                    while (iterator.hasNext()) {
                        char c = iterator.next().charAt(0);
                       if (Character.isUpperCase(c)) {
                           position = c - 'A' + 27 + position;
                        }
                        if (Character.isLowerCase(c)) {
                            position = c - 'a' + 1 + position;
                        }

                    }
                    System.out.println(position);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}





