package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeLargeStraightTest {

    private final ComputeLargeStraight computeLargeStraight = new ComputeLargeStraight();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeLargeStraight.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(6, 2, 3, 4, 5), 20),
            Arguments.of(new Roll(2, 3, 4, 5, 6), 20),
            Arguments.of(new Roll(1, 2, 2, 4, 5), 0)
        );
    }
}