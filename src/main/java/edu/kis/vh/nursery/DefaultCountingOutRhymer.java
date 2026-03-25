package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static int CALLCHECKVALUE = -1;
    private static int MULTIVALUED = 11;

    private int[] numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CALLCHECKVALUE;
    }

    public boolean isFull() {
        return total == MULTIVALUED;
    }

    protected int peekaBoo() {
        if (callCheck())
            return CALLCHECKVALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return CALLCHECKVALUE;
        return numbers[total--];
    }

}
