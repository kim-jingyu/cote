package theory.lotto;

/**
 * 1. 1 ~ 45 까지 써져있는 Ball을 로또 기계에 넣는다.
 * 2. 로또 기계에 있는 Ball들을 섞는다.
 * 3. 섞인 Ball 중에서 6개를 꺼낸다.
 */
public interface LottoMachine {
    public static final int MAX_BALL_COUNT = 45;  // 메모리에 인스턴스를 생성하지 않아도 올라간다.
    public static final int RETURN_BALL_COUNT = 6;

    public abstract void setBalls(Ball[] balls); // Ball을 45개 받는다.
    void shuffle(); // 자기가 가지고있는 Ball들을 섞는다.
    Ball[] getBalls(); // 6개의 Ball을 반환한다.
}
