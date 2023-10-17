package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeFoursTest {

    private final ComputeFours computeFours = new ComputeFours();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeFours.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(4, 4, 4, 5, 5), 12),
            Arguments.of(new Roll(4, 4, 5, 5, 5), 8),
            Arguments.of(new Roll(4, 5, 5, 5, 5), 4)
        );
    }
}