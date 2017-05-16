package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class BankAccount {
    protected static float INTEREST_PERCENTAGE = 0.04f;
    protected Money balance = new Money();


    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        return null;
    }
    protected int AccountChekSum(String counterAccount){
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        return sum;
    }

    protected Transfer doTransfer(String counterAccount,Money amount){
    return null;
    }
    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
// end::SavingsAccount[]
