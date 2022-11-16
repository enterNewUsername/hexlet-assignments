package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static String getForwardedVariables(String file) {
        List<String> fileAsList = new ArrayList<>();
        fileAsList = Arrays.asList(file.split("\n"));

        return fileAsList.stream()
             .filter(str -> str.contains("environment"))
             .filter(str -> str.contains("X_FORWARDED_"))
             .map(str -> str.split(","))
             .flatMap(Arrays::stream)
             .map(str -> str.split("X_"))
             .flatMap(Arrays::stream)
             .filter(str -> str.contains("FORWARDED_"))
             .map(str -> str.replaceAll("FORWARDED_", ""))
             .map(str -> str.replaceAll("\"", ""))
             .collect(Collectors.joining(","));
    }
}
//END
