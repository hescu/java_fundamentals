package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06 {
    public static void main(String[] args) {
        Sequence seq = new Sequence();

        Thread thread1 = new Thread(() -> {
            try {
                seq.printOdd(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                seq.printEven(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Sequence {
    private int value = 1;
    private final Object lock = new Object();
    public void printOdd(String name) throws InterruptedException {
        synchronized (lock) {
            while (value <= 100) {
                if (value % 2 == 1) {
                    System.out.println(name + ": " + value);
                    value++;
                    lock.notify();
                } else {
                    lock.wait();
                }
            }
        }
    }

    public void printEven(String name) throws InterruptedException {
        synchronized (lock) {
            while (value <= 100) {
                if (value % 2 == 0) {
                    System.out.println(name + ": " + value);
                    value++;
                    lock.notify();
                } else {
                    lock.wait();
                }
            }
        }
    }
}