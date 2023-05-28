package creational.abstractfactory.factories;

public abstract class AbstractFactory<T> {
    public abstract T create(String type);
}
