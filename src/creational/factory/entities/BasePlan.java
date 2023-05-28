package creational.factory.entities;

public abstract class BasePlan {

    protected double rate;
    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
