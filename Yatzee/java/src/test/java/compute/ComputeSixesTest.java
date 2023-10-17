package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeSixesTest {

    private final ComputeSixes computeSixes = new ComputeSixes();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeSixes.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(4, 4, 4, 5, 5), 0),
            Arguments.of(new Roll(4, 4, 6, 5, 5), 6),
            Arguments.of(new Roll(6, 5, 6, 6, 5), 18)
        );
    }
}