package theory.lambda;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("달릴 수 있다.");
            }
        };

        MyRunnableExecute e = new MyRunnableExecute();
        e.execute(m);
    }
}
