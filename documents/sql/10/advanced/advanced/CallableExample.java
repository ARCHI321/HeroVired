package advanced;
// A Java program that illustrates Callable
// to generate and return a random number between 0 - 9

// import statments
import java.util.concurrent.Callable;
import java.util.Random;

// importing the concrete class FutureTask
import java.util.concurrent.FutureTask;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

class JavaCallable implements Callable
{
    @Override
    public Object call() throws Exception
    {
// Creating an object of the  Random class
        for(int i = 0 ; i < 5 ; i++) {
            Random randObj = new Random();

// generating a random number between 0 to 9
            Integer randNo = randObj.nextInt(10);

// the thread is delayed for some random time
            Thread.sleep(randNo * 100);
            System.out.println(Thread.currentThread().getName() + ":" + randNo);
        }

// return the object that contains the
// generated random number
        return 0;
    }
}

class JavaCallableExample {
    // main method
    public static void main(String argvs[]) {
        // FutureTask is the concrete class
        // creating an array of 5 objects of the FutureTask class
        FutureTask[] randomNoTasks = new FutureTask[10];

        // loop for spawning 10 threads
        for (int j = 0; j < 10; j++) {
            // Creating a new object of the JavaCallable class
            Callable clble = new JavaCallable();

            // Creating the FutureTask with Callable
            randomNoTasks[j] = new FutureTask(clble);

            // Since FutureTask implements Runnable,
            // one can create a Thread
            // with a FutureTask object
            Thread th = new Thread(randomNoTasks[j]);
            th.start();
        }
        try {
            new CallableImplemenmtation(randomNoTasks).methodRunnable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    class CallableImplemenmtation {

        FutureTask[] randomNoTasks = new FutureTask[10];


        CallableImplemenmtation(FutureTask[] randomNoTasks) throws Exception {
            this.randomNoTasks = randomNoTasks;
        }
        // loop for receiving the random numbers

        void methodRunnable() throws Exception
        {
            for (int j = 0; j < 10; j++) {

                // invoking the get() method
                Object o = randomNoTasks[j].get();



                // The get method holds the control until the result is received
                // The get method may throw the checked exceptions
                // like when the method is interrupted. Because of this reason
                // we have to add the throws clause to the main method

                // printing the generated random number
                System.out.println("The random number is: " + o);

            }

        }
    }


