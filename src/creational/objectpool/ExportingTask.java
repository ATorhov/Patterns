package creational.objectpool;

public class ExportingTask implements Runnable {
    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }


    @Override
    public void run() {
        ExportingProcess process = pool.borrowObject();
        System.out.println("Thread " + threadNo + ": Object with process no." + process.getProcessNo() + " was borrowed.");
        pool.returnObject(process);
        System.out.println("Thread " + threadNo + ": Object with process no." + process.getProcessNo() + " was returned.");
    }
}
