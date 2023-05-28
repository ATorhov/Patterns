package creational.abstractfactory.factories;

import creational.abstractfactory.entities.loans.BusinessLoan;
import creational.abstractfactory.entities.loans.EducationLoan;
import creational.abstractfactory.entities.loans.HomeLoan;
import creational.abstractfactory.entities.loans.Loan;

public class LoanFactory extends AbstractFactory{
    @Override
    public Loan create(String type) {
        Loan loan = null;
        if (type.equals("Home")){
            loan = new HomeLoan();
        } else if (type.equals("Business")) {
            loan = new BusinessLoan();
        } else if (type.equals("Education")) {
            loan = new EducationLoan();
        }
        return loan;
    }
}
