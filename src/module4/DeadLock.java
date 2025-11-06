package module4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {


    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        new DeadLock.Thread1().start();
        new DeadLock.Thread2().start();

    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Thread1 пытается захватить lock1");
                lock1.lock();
                System.out.println("Thread1 захватил lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread1 пытается захватить lock2");
                lock2.lock();
                System.out.println("Thread1 захватил lock2");
                System.out.println("Thread1 освобождает lock1 и lock2");
                lock1.unlock();
                lock2.unlock();
                break;

            }
        }
    }


    private static class Thread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Thread2 пытается захватить lock2");
                lock2.lock();
                System.out.println("Thread2 захватил lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2 пытается захватить lock1");
                lock1.lock();
                    System.out.println("Thread2 захватил lock1");

                    System.out.println("Thread2 освобождает lock1 и lock2");
                    lock1.unlock();
                    lock2.unlock();
                    break;

            }
        }

    }
}


