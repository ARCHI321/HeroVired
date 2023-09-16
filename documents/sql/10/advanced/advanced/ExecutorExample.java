package advanced;
import java.util.Set;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyRunnable implements Runnable {

    private final long waitTime;
    private String name ;

    public MyRunnable(int timeInMillis)
    {
        this.waitTime = timeInMillis;
    }

    void setThreadName(String name){
        this.name =  name;
    }
    @Override
    public void run()
    {
        try {
            // sleep for user given millisecond
            // before checking again
            Thread.sleep(waitTime);
            Thread.currentThread().setName(name);

            // return current thread name
            System.out.println("Thread Name:::" +Thread
                    .currentThread()
                    .getName());
        }

        catch (InterruptedException ex) {
            Logger
                    .getLogger(MyRunnable.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}

// Class FutureTaskExample execute two future task
class FutureTaskExample {

    public static void main(String[] args)
    {
        // create two object of MyRunnable class
        // for FutureTask and sleep 1000, 2000
        // millisecond before checking again
        MyRunnable myrunnableobject1 = new MyRunnable(1000);
        myrunnableobject1.setThreadName("Thread 1");
        MyRunnable myrunnableobject2 = new MyRunnable(2000);
        myrunnableobject2.setThreadName("Thread 2");
        MyRunnable myrunnableobject3 = new MyRunnable(3000);
        myrunnableobject3.setThreadName("Thread 3");
        MyRunnable myrunnableobject4 = new MyRunnable(3000);
        myrunnableobject4.setThreadName("Thread 4");

        FutureTask<String>
                futureTask1 = new FutureTask<>(myrunnableobject1,
                "FutureTask1 is complete");

        FutureTask<String>
                futureTask2 = new FutureTask<>(myrunnableobject2,
                "FutureTask2 is complete");

        FutureTask<String>
                futureTask4 = new FutureTask<>(myrunnableobject4,
                "FutureTask4 is complete");

        // create thread pool of 2 size for ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(2);


        // submit futureTask1 to ExecutorService
        Future future1 = executor.submit(futureTask1);
        Future future2 = executor.submit(futureTask2);
        Future future4 = executor.submit(futureTask4);
        executor.submit(myrunnableobject3);



        while (true) {
            try {
                Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
                System.out.println("==================");
                for(Thread currThread : threadSet) {
                    System.out.println("Thread Name All:: " + currThread.getName() + " Add Detail::"+ currThread.getThreadGroup());
                }
                System.out.println("==================");


                // if both future task complete
                if (futureTask1.isDone() && futureTask2.isDone() && futureTask4.isDone()) {

                    System.out.println("All FutureTask Complete");

                    // shut down executor service
                    executor.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {

                    // wait indefinitely for future
                    // task to complete
                    System.out.println("FutureTask1 output = "
                            + futureTask1.get());
                }

                System.out.println("Waiting for FutureTask2 to complete");

                // Wait if necessary for the computation to complete,
                // and then retrieves its result
                String s = futureTask2.get(250, TimeUnit.MILLISECONDS);

                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            }

            catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
