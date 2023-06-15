package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
