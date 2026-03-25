package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int CALLCHECKVALUE = -1;
    private static final int CAPACITY = 12;

    private final int[] NUMBERS = new int[CAPACITY];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CALLCHECKVALUE;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return CALLCHECKVALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return CALLCHECKVALUE;
        return NUMBERS[total--];
    }

}
