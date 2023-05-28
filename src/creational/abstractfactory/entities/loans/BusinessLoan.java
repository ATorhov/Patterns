package creational.abstractfactory.entities.loans;

public class BusinessLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
