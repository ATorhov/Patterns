package behavioral.iterator;

import behavioral.iterator.contracts.Container;
import behavioral.iterator.contracts.Iterator;

public class CollectionOfNames implements Container {

    public String name[] = {"Drago", "Vasko", "Maria", "Iryna", "Satoshi"};
    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();
    }

    private class CollectionOfNamesIterate implements Iterator {

        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}
