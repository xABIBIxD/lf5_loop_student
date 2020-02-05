# Lösung numberListGenerator

```public class Generator {

    public String generateNumbers(int start, int end) {
        return generateNumbers(start, end, 1, ',');
    }

    public String generateNumbers(int start, int end, int steps, char delimiter) {
        String response = "";
        while (start <= end) {
            response += start;
            if (start + steps <= end) {
                response += delimiter;
            }
            start += steps;
        }
        return response;
    }
}```