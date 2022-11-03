package exercise;

//import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
class App {
    public static boolean scrabble(String randomChars, String targetWord) {
        ArrayList<Character> listOfRandomChars = new ArrayList<>();
        ArrayList<Character> listOfTargetWord = new ArrayList<>();

        for (Character c: randomChars.toLowerCase().toCharArray()) {
            listOfRandomChars.add(c);
        }

        for (Character c: targetWord.toLowerCase().toCharArray()) {
            listOfTargetWord.add(c);
        }

        for (Character c: listOfTargetWord) {
            if (listOfRandomChars.contains(c)) {
                listOfRandomChars.remove(c);
            } else {
                return false;
            }
        }
        return true;


    }
}
//END
