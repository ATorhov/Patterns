package creational.abstractfactory.entities.loans;

public class EducationLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
