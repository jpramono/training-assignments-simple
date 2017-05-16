package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends BankAccount{
    protected static float INTEREST_PERCENTAGE = 0.04f;
    private CheckingAccount registeredCounterAccount;

    @Override
    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
         // <1>
        int sum =AccountChekSum(counterAccount);
        if (sum % 11 == 0) {
            // 2. Look up counter account and make transfer object:
            Transfer result=doTransfer(counterAccount,amount);
            // 3. Check whether withdrawal is to registered counter account:
            if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
            {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }
    @Override
    public Transfer doTransfer(String counterAccount,Money amount){
        Transfer result=null;
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        return  result= new Transfer(this, acct, amount);
    }

}
// end::SavingsAccount[]
