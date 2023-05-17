package SandyYudhaAlvyan;

import java.util.*;

public class Soal_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> letterCount = countLetters(input);
        List<Map.Entry<Character, Integer>> sortedEntries = sortEntries(letterCount);

        System.out.println("Output: " + sortedEntries);
    }

    private static Map<Character, Integer> countLetters(String input) {
        Map<Character, Integer> letterCount = new TreeMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercaseChar = Character.toLowerCase(c);
                letterCount.put(lowercaseChar, letterCount.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        return letterCount;
    }

    private static List<Map.Entry<Character, Integer>> sortEntries(Map<Character, Integer> letterCount) {
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(letterCount.entrySet());

        Collections.sort(sortedEntries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                int countComparison = entry2.getValue().compareTo(entry1.getValue());
                if(countComparison == 0) {
                	return entry1.getKey().compareTo(entry1.getKey());
                	
                }
                return countComparison;
            }
        });
        return sortedEntries;
    }
}