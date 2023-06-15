package behavioral.memento;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        careTaker.add(originator.saveToMemento());

        originator.setState("State #2");
        careTaker.add(originator.saveToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveToMemento());


        System.out.println("Current state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));

        System.out.println("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));

        System.out.println("Second saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));

        System.out.println("Third saved state: " + originator.getState());
    }
}
