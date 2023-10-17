package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputePairTest {

    private final ComputePair computePair = new ComputePair();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computePair.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(3, 4, 3, 5, 6), 6),
            Arguments.of(new Roll(5, 3, 3, 3, 5), 10),
            Arguments.of(new Roll(5, 3, 6, 6, 5), 12)
        );
    }
}