import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BinaryAdditionTest {

    private BinaryAddition binaryAddition = new BinaryAddition();

    @ParameterizedTest(name = "a = {1}, b = {2}")
    @CsvSource(textBlock = """
                   10,    1,   1
                    1,    0,   1
                    1,    1,   0
                  100,    2,   2
               111111,   51,  12
    """)
    @DisplayName("Sample tests")
    void sampleTests(String expected, int a, int b) {
        assertEquals(expected, binaryAddition.binaryAddition(a, b));
    }
}
