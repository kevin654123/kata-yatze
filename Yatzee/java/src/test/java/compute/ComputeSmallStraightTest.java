package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeSmallStraightTest {

    private final ComputeSmallStraight computeSmallStraight = new ComputeSmallStraight();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeSmallStraight.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(1, 2, 3, 4, 5), 15),
            Arguments.of(new Roll(2, 3, 4, 5, 1), 15),
            Arguments.of(new Roll(1, 2, 2, 4, 5), 0)
        );
    }
}