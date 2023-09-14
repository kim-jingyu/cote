package theory.lotto;

public class LottoMachineMain {
    public static void main(String[] args) {
        // Ball 인스턴스를 45개 참조할 수 있는 배열 생성
        // 즉, Ball 인스턴스 45개를 참조할 수 있는 참조 변수가 만들어진 것이고, 인스턴스가 생성된 것은 아니다.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }


        // 로또 머신 인스턴스 생성
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.shuffle();
        Ball[] result = lottoMachine.getBalls();

        for (Ball ball : result) {
            System.out.println("ball.getNumber() = " + ball.getNumber());
        }

    }
}
