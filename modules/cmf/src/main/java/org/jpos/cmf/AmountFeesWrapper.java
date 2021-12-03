package org.jpos.cmf;

import java.util.LinkedList;
import java.util.stream.Collectors;


/**
 * Wrapper to handle a sequence of {@link AmountFee}, from jPOS-CMF DE-046
 *
 * @see AmountFee
 */
public class AmountFeesWrapper extends LinkedList<AmountFee> {

    public AmountFeesWrapper() {
        super();
    }

    public AmountFeesWrapper(String data) {
        super();
        if (data.length() % AmountFee.SERIALIZED_DATA_LENGTH != 0)
            throw new IllegalArgumentException("Invalid length");

        for (int i = 0; i < data.length(); ) {
            add(new AmountFee(data.substring(i, i += AmountFee.SERIALIZED_DATA_LENGTH)));
        }
    }

    public String serialize() {
        return stream().map(AmountFee::serialize).collect(Collectors.joining());
    }
}
