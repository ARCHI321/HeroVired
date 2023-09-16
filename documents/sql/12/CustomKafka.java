package advanced;

import java.util.List;
import java.util.concurrent.*;

public class CustomKafka {
    public static void main(String args[]) throws InterruptedException {
        LinkedBlockingQueue<String> blockingQueue = new LinkedBlockingQueue(5);
        Thread p1 = new Thread(new Producer(blockingQueue,"Producer 1"));
        Thread p2 = new Thread(new Producer(blockingQueue,"Producer 2"));
        Thread p3 = new Thread(new Producer(blockingQueue,"Producer 3"));


        Thread c1 = new Thread(new Consumer(blockingQueue,"Consumer 1"));
        Thread c2 = new Thread(new Consumer(blockingQueue,"Consumer 2"));
//        Thread c3 = new Thread(new Consumer(blockingQueue,"Consumer 3"));
//        c1.setName("Consumer 3");

//        ExecutorService executor = Executors.newFixedThreadPool(5);
//        executor.submit(p1);
//        executor.submit(p2);
//        executor.submit(c1);
//        executor.submit(c2);
//        executor.submit(p3);
//        executor.submit(c3);

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();

        Thread.sleep(20000);

//        executor.shutdown();

    }
}
    class Producer implements Runnable{

        LinkedBlockingQueue linkedBlockingQueue ;
        Producer(LinkedBlockingQueue linkedBlockingQueue, String name){
            this.linkedBlockingQueue =  linkedBlockingQueue;
            Thread.currentThread().setName(name);
        }
        public void run() {
            System.out.println("In Producer");
            for (int i = 0; i < 10; i++) {
                try {
                    produce(Thread.currentThread().getName()+":"+i);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        synchronized void  produce(String i) throws InterruptedException {
                    if (linkedBlockingQueue.size() < 5) {
                        linkedBlockingQueue.add(i);
                        System.out.println("Producer :"+ Thread.currentThread().getName() +" : add Value"+ i);
                        notifyAll();
                        Thread.sleep(500);
                    }else {
                        wait(100);
                    }
                }
            }


class Consumer implements Runnable{
    LinkedBlockingQueue linkedBlockingQueue ;
    Consumer(LinkedBlockingQueue linkedBlockingQueue,String name){
        this.linkedBlockingQueue =  linkedBlockingQueue;
        Thread.currentThread().setName(name);
    }
    public void run() {
        while (true) {
            try {
                consume();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    synchronized void  consume() throws InterruptedException {
        if (linkedBlockingQueue.size() > 0) {
            String removedValue = (String)linkedBlockingQueue.remove();
            System.out.println("Consumer :"+ Thread.currentThread().getName() +" removed Value : " + removedValue);
            notifyAll();
            Thread.sleep(500);
        }else {
            wait(100);
        }
    }
}



