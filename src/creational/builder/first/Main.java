package creational.builder.first;

import creational.builder.first.builders.CDBuilder;
import creational.builder.first.entities.CDType;

public class Main {
    public static void main(String[] args) {
        CDBuilder builder = new CDBuilder();

        CDType sony = builder.buildSonyCD();
        sony.showItems();

        CDType samsung = builder.buildSamsungCD();
        samsung.showItems();
    }
}
