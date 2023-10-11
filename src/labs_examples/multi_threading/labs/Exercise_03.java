package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class Exercise_03 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable2(), "Gumbo");
        Thread thread2 = new Thread(new MyRunnable2(), "Jambalaya");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        for(int count = 10; count >= 0; count--) {
            System.out.println(Thread.currentThread().getName() + ": " + count);
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}

class AnotherRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        for(int count = 10; count >= 0; count--) {
            System.out.println(Thread.currentThread().getName() + ": " + count);
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}