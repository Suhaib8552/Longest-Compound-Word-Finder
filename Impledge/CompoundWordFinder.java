import java.io.*;
import java.util.*;

public class CompoundWordFinder {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./Input_02.txt"))) {
            String word;
            while ((word = br.readLine()) != null) {
                words.add(word);
                wordSet.add(word);
            }
        }

        words.sort((a, b) -> b.length() - a.length());

        String longest = "", secondLongest = "";
        long startTime=System.nanoTime();

        for (String word : words) {
            if (isCompoundWord(word, wordSet)) {
                if (longest.isEmpty()) {
                    longest = word;
                } else {
                    secondLongest = word;
                    break;
                }
            }
        }
        long endTime=System.nanoTime();
        long displayTime=endTime-startTime;

        System.out.println("Longest compound word: " + longest);
        System.out.println("Second longest compound word: " + secondLongest);
        System.out.println("Time taken: "+displayTime+" ms");

    }

    
    public static boolean isCompoundWord(String word, Set<String> wordSet) {
        for (int i = 1; i < word.length(); i++) {
            if (wordSet.contains(word.substring(0, i)) && 
               (wordSet.contains(word.substring(i)) || isCompoundWord(word.substring(i), wordSet))) {
                return true;
            }
        }
        return false;
    }
}
