package creational.abstractfactory;

import creational.abstractfactory.contracts.Bank;
import creational.abstractfactory.entities.loans.Loan;
import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.factories.FactoryCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = reader.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName = reader.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        assert bankFactory != null;
        Bank b = (Bank) bankFactory.create(bankName);

        System.out.print("\n");
        System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");

        double rate = Double.parseDouble(reader.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(reader.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(reader.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        assert loanFactory != null;
        Loan l = (Loan) loanFactory.create(loanName);
        l.getInterestRate(rate);
        l.calculateLoanRate(loanAmount,years);

    }
}
