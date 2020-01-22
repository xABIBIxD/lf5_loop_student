package numberListGenerator;

public class Generator {

    public String generateNumbers(int start, int end) {
        String response = "";
        while (start <= end) {
            response += start;
            if (start != end) {
                response += ", ";
            }
            start++;
        }
        return response;
    }
}
