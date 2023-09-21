package theory.thread;

public class MagicBox {
    synchronized public void star() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread Name : " + name);
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            try {
                Thread.sleep(1000); // 1초간 쉰다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
