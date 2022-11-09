package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> booksList, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book: booksList) {
            if (book.entrySet().containsAll(where.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
