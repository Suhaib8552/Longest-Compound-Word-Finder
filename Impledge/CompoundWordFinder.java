import java.io.*;
import java.util.*;

public class CompoundWordFinder {

    public static boolean func(String word, Set<String> ws) {
        for (int i = 1; i < word.length(); i++) {
            if (ws.contains(word.substring(0, i)) && 
               (ws.contains(word.substring(i)) || func(word.substring(i), ws))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        List<String> w = new ArrayList<>();
        Set<String> ws = new HashSet<>();
        try (BufferedReader buff = new BufferedReader(new FileReader("./Input_02.txt"))) {
            String word;
            while ((word = buff.readLine()) != null) {
                w.add(word);
                ws.add(word);
            }
        }

        w.sort((a, b) -> b.length() - a.length());

        String longestComp = "", secondlongestComp = "";
        long startT=System.nanoTime();

        for (String word : w) {
            if (func(word, ws)) {
                if (longestComp.isEmpty()) {
                    longestComp = word;
                } else {
                    secondlongestComp = word;
                    break;
                }
            }
        }
        long endT=System.nanoTime();
        double displayT=(endT-startT)*Math.pow(10,-6);

        System.out.println("Longest compound word: " + longestComp);
        System.out.println("Second Longest compound word: " + secondlongestComp);
        System.out.println("Time taken: "+displayT+" ms");

    }

    
    
}
