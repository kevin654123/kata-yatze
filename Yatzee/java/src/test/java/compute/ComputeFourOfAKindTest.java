package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeFourOfAKindTest {

    private final ComputeFourOfAKind computeFourOfAKind = new ComputeFourOfAKind();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeFourOfAKind.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(3, 3, 3, 3, 5), 12),
            Arguments.of(new Roll(5, 5, 5, 4, 5), 20),
            Arguments.of(new Roll(3, 3, 3, 3, 3), 12)
        );
    }
}