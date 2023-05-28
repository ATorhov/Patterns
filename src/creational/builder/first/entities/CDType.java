package creational.builder.first.entities;

import creational.builder.first.contracts.Packing;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs){
        items.add(packs);
    }

    public void getCost(){
        for (Packing p : items) {
            p.price();
        }
    }

    public void showItems() {
        for (Packing p : items) {
            System.out.println("CD name: "+p.pack());
            System.out.println("CD price: "+p.price());
            System.out.println("=====================");
        }
    }
}
