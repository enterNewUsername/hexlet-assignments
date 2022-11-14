package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {

        int size = image.length;
        List<String[]> strArray = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String[][] resultArray = new String[size * 2][size * 2];

        Arrays.stream(image)
            .forEach((str) -> {
                strArray.add(str);
                strArray.add(str);
            });

        strArray.stream()
            .flatMap(str -> Arrays.stream(str))
            .forEach((sym) -> {
                result.add(sym);
                result.add(sym);
            });
        int k = 0;
        for (int i = 0; i < size * 2; i++) {
            for (int j = 0; j < size * 2; j++) {
                resultArray[i][j] = result.get(k);
                k++;
            }
        }
        return resultArray;
    }
}
// END
