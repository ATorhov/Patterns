package behavioral.iterator;

import behavioral.iterator.contracts.Iterator;

public class Main {
    public static void main(String[] args) {

        CollectionOfNames names = new CollectionOfNames();

        for (Iterator iterator = names.getIterator(); iterator.hasNext(); ) {
            String n = (String) iterator.next();
            System.out.println("Name: " + n);
        }
    }
}
