package creational.abstractfactory.entities.loans;

public class HomeLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
