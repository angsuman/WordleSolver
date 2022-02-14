import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LetterFrequency {
    public static void main(String[] files) throws IOException {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (String file : files) {
            for (String word : Files.readAllLines(Paths.get(file))) {
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    Integer f = frequencies.get(c);
                    if (f == null) f = 0;
                    frequencies.put(c, ++f);
                }
            }
        }
        List<Map.Entry<Character, Integer>> frequencyList = new LinkedList<>(frequencies.entrySet());
        //frequencyList.sort(Map.Entry.comparingByValue());
        frequencyList.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());
        for(Map.Entry<Character, Integer> line : frequencyList) System.out.println(line.getKey() + "\t" + line.getValue());
    }
}
