package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        MyRunnable thread1 = new MyRunnable("Thread No.1");
        Thread thread2 = new Thread(new AnotherRunnable2(), "Jambalaya");
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    Thread thread;

    public MyRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        for(int count = 10; count >= 0; count--) {
            System.out.println(thread.getName() + ": " + count);
        }
        System.out.println(thread.getName() + " terminating.");
    }
}

class AnotherRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        for(int count = 10; count >= 0; count--) {
            System.out.println(Thread.currentThread().getName() + ": " + count);
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}