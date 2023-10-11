package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05 {
    public static void main(String[] args) {
        SynchronizationExample2 example = new SynchronizationExample2();

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

class SynchronizationExample2 {
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

    public void secondTask() {
        synchronized (this) {
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
}