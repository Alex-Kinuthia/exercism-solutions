//imports
import java.util.HashMap;

//class Scrabble
public class Scrabble {
  //attributes with their access modifiers
    private final String word;
    private static final HashMap<Integer, Integer> letterScore = new HashMap<>('Z' - 'A');

//constructor Scrabble
    public Scrabble(String word) {
        this.word = word;
    }

// whereby if there is no word, return zero
    public int getScore() {
        if(word==null) return 0;

// to enhance that the output of the returned word is uppercase
        return word.toUpperCase()
            .chars()
            .map(c -> letterScore.getOrDefault(c, 0))
            .reduce(0, (a, b) -> a + b);
    }

// map the letters add points in order to score
    private static void mapToScore(String letters, Integer score) {
        letters.chars().forEach(letter -> letterScore.put(letter, score));
    }

    static {
        mapToScore("AEIOULNRST", 1);
        mapToScore("DG", 2);
        mapToScore("BCMP", 3);
        mapToScore("FHVWY", 4);
        mapToScore("K", 5);
        mapToScore("JX", 8);
        mapToScore("QZ", 10);
    }
}
