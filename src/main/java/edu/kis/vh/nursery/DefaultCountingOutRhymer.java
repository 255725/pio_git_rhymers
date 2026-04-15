package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int EMPTY_INDICATOR = -1;
    private static final int DEFAULT_RETURN_VALUE = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_INDICATOR;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY_INDICATOR;
    }

    protected boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
