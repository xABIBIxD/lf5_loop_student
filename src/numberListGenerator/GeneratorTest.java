package numberListGenerator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratorTest {

    @ParameterizedTest(name = "start={0}, end={1}, result={2}")
    @CsvSource(delimiter = '-', value = {
            "3 - 5 - '3, 4, 5'",
            "11 - 14 - '11, 12, 13, 14'",
            "45 - 51 - '45, 46, 47, 48, 49, 50, 51'"
    })
    public void givenStartBelowEnd_whenGenerateNumbers_ThenReturnNumberList(int start, int end, String result) {
        assertEquals(result, new Generator().generateNumbers(start, end));
    }

    @ParameterizedTest(name = "start={0}, end={1}, result={2}")
    @CsvSource(delimiter = '-', value = {
            "5 - 3 -''",
            "122 - 0 -''"
    })
    public void givenEndBelowStart_whenGenerateNumbers_ThenReturnEmptyString(int start, int end, String result) {
        assertEquals(result, new Generator().generateNumbers(start, end));
    }


}
