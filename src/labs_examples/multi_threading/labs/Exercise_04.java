package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {
    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();

        Thread thread1 = new Thread(() -> {
            try {
                example.firstTask();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(example::secondTask);

        thread1.start();
        thread2.start();
    }
}

class SynchronizationExample {
    private boolean condition = false;

    public void firstTask() throws InterruptedException {
        synchronized (this) {
            while (!condition) {
                System.out.println("First task is waiting.");
                wait();
            }
            System.out.println("First task is executing.");
        }
    }

    public synchronized void secondTask() {
        System.out.println("Second task is working.");
        condition = true;
        notify();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}