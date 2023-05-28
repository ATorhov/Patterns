package creational.builder.first.entities;

public class Sony extends Company{
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public int price() {
        return 15;
    }
}
