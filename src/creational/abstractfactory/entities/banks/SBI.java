package creational.abstractfactory.entities.banks;

import creational.abstractfactory.contracts.Bank;

public class SBI implements Bank {

    private final String bankName;

    public SBI() {
        this.bankName = "SBI bank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
