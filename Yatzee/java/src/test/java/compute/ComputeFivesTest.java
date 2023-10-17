package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeFivesTest {

    private final ComputeFives computeFives = new ComputeFives();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeFives.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(4, 4, 4, 5, 5), 10),
            Arguments.of(new Roll(4, 4, 5, 5, 5), 15),
            Arguments.of(new Roll(4, 5, 5, 5, 5), 20)
        );
    }
}