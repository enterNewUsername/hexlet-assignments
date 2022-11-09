package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
//import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>();
        List<Integer> resultNumbers = new ArrayList<>();
        List<Integer> emptyNumbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(32);
        numbers.add(123);
        numbers.add(45);
        numbers.add(59);
        numbers.add(67);
        numbers.add(70);
        resultNumbers.add(12);
        resultNumbers.add(32);
        resultNumbers.add(123);

        assertThat(App.take(numbers, 3)).isEqualTo(resultNumbers);
        assertThat(App.take(numbers, 30)).isEqualTo(numbers);
        assertThat(App.take(emptyNumbers, 30)).isEmpty();
        assertThat(App.take(numbers, 0)).isEmpty();
        // END
    }
}
