package behavioral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        try {
            final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String response = bufferedReader.readLine();
                setChanged();
                notifyObservers();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
