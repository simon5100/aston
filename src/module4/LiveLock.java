package module4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {

    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();

    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    lock1.tryLock(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread1 захватил lock1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread1 пытается захватить lock2");
                if (lock2.tryLock()) {
                    System.out.println("Thread1 захватил lock2");
                    System.out.println("Thread1 освобождает lock1 и lock2");
                } else {
                    System.out.println("Thread1 освобождает lock1 и начинает всё заново");
                    lock1.unlock();
                    continue;
                }
                break;
            }
            lock1.unlock();
            lock2.unlock();
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    lock2.tryLock(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2 захватил lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                System.out.println("Thread2 пытается захватить lock1");
                if (lock1.tryLock()) {
                    System.out.println("Thread2 захватил lock1");

                    System.out.println("Thread2 освобождает lock1 и lock2");


                } else {
                    System.out.println("Thread2 освобождает lock2 и начинает всё заново");
                    lock2.unlock();
                    continue;
                }

                break;
            }
            lock1.unlock();
            lock2.unlock();
        }
    }
}
