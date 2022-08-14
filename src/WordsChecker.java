import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] world = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < world.length; i++) {
            world[i].toLowerCase();
            set.add(world[i]);
        }
    }

    public boolean hasWord(String word) {
        String queryLower=word.toLowerCase();
        return set.contains(queryLower);
    }
}
