package advanced;
class TableStaticSync
{
    synchronized static void printTableStaticSync(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}
class MyThread10 extends Thread{
    public void run(){
        TableStaticSync.printTableStaticSync(10);
    }
}
class MyThread20 extends Thread{
    public void run(){
        TableStaticSync.printTableStaticSync(100);
    }
}
class MyThread30 extends Thread{
    public void run(){
        TableStaticSync.printTableStaticSync(1000);
    }
}
class MyThread40 extends Thread{
    public void run(){
        TableStaticSync.printTableStaticSync(10000);
    }
}
public class StaticSynchronizedExample{
    public static void main(String t[]){
        MyThread10 t10=new MyThread10();
        MyThread20 t20=new MyThread20();
        MyThread30 t30=new MyThread30();
        MyThread40 t40=new MyThread40();
        t10.start();
        t20.start();
        t30.start();
        t40.start();
    }
}   
