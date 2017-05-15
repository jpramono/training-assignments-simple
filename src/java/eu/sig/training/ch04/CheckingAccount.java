package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        // 2. Assuming result is 9-digit bank account number, validate 11-test:
       SavingsAccount sa =new SavingsAccount();
        return sa.makeTransfer(counterAccount,amount);
    }

    public void addInterest() {
        SavingsAccount sa =new SavingsAccount();
        sa.addInterest();
    }
}
// end::CheckingAccount[]
