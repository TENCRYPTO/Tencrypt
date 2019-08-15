package kin.sdk.transactiondata;

import kin.sdk.internal.blockchain.TransactionInternal;

import java.math.BigDecimal;

public class PaymentTransaction extends TransactionInternal {

    private final String destination;
    private final BigDecimal amount;
    private final String memo;

    public PaymentTransaction(kin.base.Transaction baseTransaction, String destination, BigDecimal amount,
                              String memo) {
        super(baseTransaction);
        this.destination = destination;
        this.amount = amount;
        this.memo = memo;
    }

    /**
     * @return the account address that receives the payment.
     */
    public String destination() {
        return destination;
    }

    /**
     * @return the amount of kin that was sent in this transaction.
     */
    public BigDecimal amount() {
        return amount;
    }

    /**
     * @return the memo of this transaction.
     * In this case you will get a string representation of a memo as opposed to {@link RawTransaction#memo()}
     */
    public String memo() {
        return memo;
    }

}