package edu.kis.vh.nursery;

/**
 * Klasa dostarczająca wyliczankę opartą na podejściu kolejki First In First Out.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();


    /**
     * Zwraca i usuwa element z wyliczanki zgodnie z zasadą FIFO.
     *
     * @return wartość usuniętego elementu
     */
    @Override
    protected int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
