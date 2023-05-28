package creational.builder.first.builders;

import creational.builder.first.entities.CDType;
import creational.builder.first.entities.Samsung;
import creational.builder.first.entities.Sony;

public class CDBuilder {

    public CDType buildSonyCD() {
        CDType cdType = new CDType();
        cdType.addItem(new Sony());
        return cdType;
    }

    public CDType buildSamsungCD() {
        CDType cdType = new CDType();
        cdType.addItem(new Samsung());
        return cdType;
    }
}
