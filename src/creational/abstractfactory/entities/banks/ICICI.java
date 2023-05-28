package creational.abstractfactory.entities.banks;

import creational.abstractfactory.contracts.Bank;

public class ICICI implements Bank {

    private final String bankName;

    public ICICI() {
        this.bankName = "ICICI bank";
    }


    @Override
    public String getBankName() {
        return bankName;
    }
}
