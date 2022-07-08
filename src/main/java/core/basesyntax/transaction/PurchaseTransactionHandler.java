package core.basesyntax.transaction;

public class PurchaseTransactionHandler implements TransactionHandler {
    @Override
    public int getAmount(int amount, int newAmount) {
        return amount - newAmount;
    }
}
