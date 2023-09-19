package theory.thread;

public class MyThreadExam {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("thread name = " + name);
        System.out.println("start!");

        // 1초마다 * 를 10번 출력하는 프로그램
        MyThread mt1 = new MyThread("*");
        // 1초마다 + 를 10번 출력하는 프로그램
        MyThread mt2 = new MyThread("+");

        mt1.start();
        mt2.start();

        System.out.println("end!");
    }
}
