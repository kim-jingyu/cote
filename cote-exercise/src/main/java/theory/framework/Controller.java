package theory.framework;

/**
 * Controller의 종류가 여러 개이고, 초기화 부분과 마무리 부분의 코드는 같고, 실행 부분만 코드가 다르다.
 */
public abstract class Controller {
    protected final void init() {
        System.out.println("초기화 코드");
    }

    protected final void close() {
        System.out.println("마무리 코드");
    }

    // 실행 코드
    protected abstract void run();

    // 템플릿 메서드
    public void execute() {
        init();
        run();
        close();
    }
}
