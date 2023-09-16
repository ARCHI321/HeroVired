package advanced;

    class Table{
        int commonVariable ;
        void  printTable(String n){//method not synchronized

            synchronized (this) {
//                System.out.println("Thread name ::"+Thread.currentThread().getName() + ":::"+n*i );
                System.out.println(Thread.currentThread().getName() + "Step 1: " + n);
                System.out.println(Thread.currentThread().getName() + "Step 2 " + n);

                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }

                System.out.println(Thread.currentThread().getName() + "Step 3 " + n);
                System.out.println(Thread.currentThread().getName() + "Step 4 " + n);
                notify();
            }


        }
    }

    class MyThread1 extends Thread{
        Table t;
        MyThread1(Table t){
            this.t=t;
        }
        public void run(){
            t.printTable("5");
        }

    }
    class MyThread2 extends Thread{
        Table t;
        MyThread2(Table t){
            this.t=t;
        }
        public void run(){
            t.printTable("100");
        }
    }

    class UnSynchronizedExample{
        public static void main(String args[]){
            Table obj = new Table();//only one object  
            MyThread1 t1=new MyThread1(obj);
            t1.setName("Thread 1");
            MyThread2 t2=new MyThread2(obj);
            t2.setName("Thread 2");
            t1.start();
            t2.start();
        }
    }

