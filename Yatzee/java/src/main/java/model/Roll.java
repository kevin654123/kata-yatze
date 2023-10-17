package model;

import java.util.Arrays;

public record Roll(int[] dice) {

    public Roll(int d1, int d2, int d3, int d4, int d5) {
        this(new int[]{d1, d2, d3, d4, d5});
    }

    @Override
    public String toString() {
        return "Roll{" +
            "dice=" + Arrays.toString(dice) +
            '}';
    }
}
