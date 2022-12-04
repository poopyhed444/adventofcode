import java.util.Scanner;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class day3pt2 {
    public static void main(String[] args) {
        int position = 0;
        try (Scanner scanner = new Scanner(Paths.get("src//day3.txt"))) {

            while (scanner.hasNextLine()) {
                String line1 = scanner.nextLine();
                String line2 = scanner.nextLine();
                String line3 = scanner.nextLine();
                if (line1.isEmpty()) {
                    break;
                } else {
                    Set<String> uno = new HashSet<>();
                    Set<String> dos = new HashSet<>();
                    Set<String> tres = new HashSet<>();
                    for (int i = 0; i < line1.length(); i++) {
                        uno.add(line1.substring(i, i + 1));
                    }
                    for (int j = 0; j < line2.length(); j++) {
                        dos.add(line2.substring(j, j + 1));
                    }
                    for (int k = 0; k < line3.length(); k++) {
                        tres.add(line3.substring(k, k + 1));
                    }
                    uno.retainAll(dos);
                    uno.retainAll(tres);
                    Iterator<String> iterator = uno.iterator();
                    while (iterator.hasNext()) {
                        char ch = iterator.next().charAt(0);
                        if (Character.isUpperCase(ch)) {
                            position = ch - 'A' + 27 + position;
                        }
                        if (Character.isLowerCase(ch)) {
                            position = ch - 'a' + 1 + position;
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
