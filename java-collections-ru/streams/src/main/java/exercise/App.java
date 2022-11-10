package exercise;

import java.util.List;
//import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long gmailCount = emails.stream()
                .filter(email -> email.contains("@gmail.com"))
                .count();
        long yandexCount = emails.stream()
                .filter(email -> email.contains("@yandex.ru"))
                .count();
        long hotmailCount = emails.stream()
                .filter(email -> email.contains("@hotmail.com"))
                .count();
        return gmailCount + yandexCount + hotmailCount;

    }
}
// END
