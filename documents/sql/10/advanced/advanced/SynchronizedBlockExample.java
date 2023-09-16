package advanced;
class TableSynchnonizedBlock
{
    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){

                System.out.println(Thread.currentThread().getName()+" Start:"+n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
                System.out.println(Thread.currentThread().getName() + " End");

            }
        }
    }//end of the method
}

class MyThread5 extends Thread{
    TableSynchnonizedBlock t;
    MyThread5(TableSynchnonizedBlock t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread6 extends Thread{
    TableSynchnonizedBlock t;
    MyThread6(TableSynchnonizedBlock t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class SynchronizedBlockExample{
    public static void main(String args[]){
        TableSynchnonizedBlock obj = new TableSynchnonizedBlock();//only one object
        MyThread6 t6=new MyThread6(obj);
        t6.setName("Thread 6");
        MyThread5 t5=new MyThread5(obj);
        t5.setName("Thread 5");
        t5.start();
        t6.start();
    }
}
