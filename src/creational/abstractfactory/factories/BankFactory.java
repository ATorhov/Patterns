package creational.abstractfactory.factories;

import creational.abstractfactory.contracts.Bank;
import creational.abstractfactory.entities.banks.HDFC;
import creational.abstractfactory.entities.banks.ICICI;
import creational.abstractfactory.entities.banks.SBI;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank create(String type) {
        Bank bank = null;
        if (type.equals("HDFC")) {
            bank = new HDFC();
        } else if (type.equals("ICICI")) {
            bank = new ICICI();
        } else if (type.equals("SBI")) {
            bank = new SBI();
        }
        return bank;
    }
}
