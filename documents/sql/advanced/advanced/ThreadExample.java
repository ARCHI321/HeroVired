package advanced;

import java.util.concurrent.Callable;

public class ThreadExample {
    public static void main(String args[]){
//        System.out.println(Thread.currentThread().getName());
//        // Thread Class
//        new ThreadClassExample().start();
//        new ThreadClassExample().start();
//
//        // Runnable Interface
//
//        Thread t1 =  new Thread(new RunnableExample());
//        t1.start();

        // Implementing Runnable
//        Thread t2 = new Thread(new MotorFactory(10));
//        t2.start();
//
//        Thread t3 = new Thread(new MotorFactory(4));
//        t3.start();


    }


}

class ThreadClassExample extends Thread {
    public void run(){
        for( int i = 0 ; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class RunnableExample implements Runnable {

    @Override
    public void run() {
        for( int i = 0 ; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + ":RunnableExample:" + i);
        }
    }
}

abstract class Motor {
    int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }



}

class MotorFactory extends Motor implements Runnable{

    MotorFactory(int noOfWheels){
        this.setNoOfWheels(noOfWheels);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + getNoOfWheels());
    }
}



