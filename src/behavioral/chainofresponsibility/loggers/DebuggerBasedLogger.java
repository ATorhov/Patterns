package behavioral.chainofresponsibility.loggers;

public class DebuggerBasedLogger extends Logger{

    public DebuggerBasedLogger(int levels){
        this.levels = levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER INFO: "+msg);
    }
}
