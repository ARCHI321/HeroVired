package advanced;
//example of java synchronized method
class TableSynchronized{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":" + n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread3 extends Thread{
    TableSynchronized t;
    MyThread3(TableSynchronized t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread4 extends Thread{
    TableSynchronized t;
    MyThread4(TableSynchronized t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class SynchronizedMethodExample{
    public static void main(String args[]){
        TableSynchronized obj = new TableSynchronized();//only one object
        MyThread3 t3=new MyThread3(obj);
        t3.setName("Thread 3");
        MyThread4 t4=new MyThread4(obj);
        t4.setName("Thread 4");
        t3.start();
        t4.start();
    }
}
