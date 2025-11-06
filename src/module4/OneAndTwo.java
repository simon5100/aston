package module4;

public class OneAndTwo {
    public static void main(String[] args) {

       Thread thread1 = new Thread(() -> {
           while (true) {
               System.out.println(1);
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       });

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println(2);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
