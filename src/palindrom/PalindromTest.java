package palindrom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromTest {
    private Palindrom myPalindrom;

    @BeforeEach
    public void setUp() {
        this.myPalindrom = new Palindrom();
    }

    @ParameterizedTest(name = "text={0}")
    @CsvSource(value = {"retter", "reliefpfeiler", "anna", "123321"})
    public void GivenPalindromInOneWord_WhenisPalindrom_ThenReturnTrue(String text) {
        assertTrue(myPalindrom.isPalindrom(text));
    }

    @ParameterizedTest(name = "text={0}")
    @CsvSource(value = {"Retter", "reliefpfeileR", "aNNa", "123321"})
    public void GivenPalindromInOneWordButOneSignInUpperCase_WhenisPalindrom_ThenReturnTrue(String text) {
        assertTrue(myPalindrom.isPalindrom(text));
    }

    @ParameterizedTest(name = "text={0}")
    @CsvSource(value = {"sören", "regen", "palindrom", "132321", "Es ist schlechtes Wetter"})
    public void GivenNoPalindromInOneWord_WhenIsPalindrom_ThenReturnFalse(String text) {
        assertFalse(myPalindrom.isPalindrom(text));
    }

    @ParameterizedTest(name = "text={0}")
    @CsvSource(value = {"Anna hetzte Hanna", " O Genie der Herr ehre dein Ego", "Die Liebe ist Sieger stets rege ist sie bei Leid",
            "Able was I ere I saw Elba"})
    public void GivenPalindromInWithWhitespaces_WhenIsPalindrom_ThenReturnTrue(String text) {
        assertTrue(myPalindrom.isPalindrom(text));
    }


}
