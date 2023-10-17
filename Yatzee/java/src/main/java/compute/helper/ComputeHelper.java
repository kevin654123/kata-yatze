package compute.helper;

import model.Roll;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class ComputeHelper {

    private ComputeHelper() {
    }

    public static int countSames(Roll roll, int number) {
        return getEachDiceSum(roll)
            .getOrDefault(number, 0);
    }

    public static int xOfAKind(Roll roll, int kind) {
        return getEachOccurrence(roll)
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() >= kind)
            .mapToInt(entry -> entry.getKey() * kind)
            .max()
            .orElse(0);
    }

    public static Map<Integer, Long> getEachOccurrence(Roll roll) {
        return Arrays.stream(roll.dice())
            .boxed()
            .collect(groupingBy(Function.identity(), counting()));
    }

    public static Map<Integer, Integer> getEachDiceSum(Roll roll) {
        return Arrays.stream(roll.dice())
            .boxed()
            .collect(groupingBy(Function.identity(), summingInt(Integer::intValue)));
    }

    public static int getSum(Roll roll) {
        return IntStream.of(roll.dice())
            .sum();
    }
}
