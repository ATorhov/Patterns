package creational.abstractfactory.entities.banks;

import creational.abstractfactory.contracts.Bank;

public class HDFC implements Bank {

    private final String bankName;

    public HDFC(){
        bankName = "HDFC bank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
