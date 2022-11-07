package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence == "") {
            return new HashMap<>();
        }
        String[] splittedSentence = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word: splittedSentence) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                Integer count = wordCount.get(word) + 1;
                wordCount.put(word, count);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        String result = "\n";

        for (Map.Entry<String, Integer> string: wordsCount.entrySet()) {
            result = result + "  " + string.getKey() + ": " + string.getValue() + "\n";
        }
        return "{" + result + "}";
    }
    /*public static String toString(Map<String, Integer> wordsCount) {
        String result = "";

        for (String key: wordsCount.keySet()) {
            Integer value = wordsCount.get(key);
            result = result + "  " + key + ": " + value + "\n";
        }
        return "{" + result + "}";
    }*/
}
//END
