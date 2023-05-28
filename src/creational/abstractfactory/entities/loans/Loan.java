package creational.abstractfactory.entities.loans;

public abstract class Loan {

    protected double rate;

    public abstract void getInterestRate(double rate);

    /**
     * To calculate the monthly loan payment i.e. EMI
     * rate = annual interest rate / 12 * 100;
     * n = number of monthly installments;
     * 1 year = 12 months.
     * n = years * 12;
     *
     */

    public void calculateLoanRate(double loanAmount, int years) {
        double EMI;
        int n;

        n = years * 12;
        rate /= 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) -1 )) * loanAmount;

        System.out.println("your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed.");
    }
}
