package book.ch12.press_keypad;

public class PressKeypadV0 implements PressKeypad{
    private static class Hand {
        private final int baseX;
        String hand;
        float preference;
        int x;
        int y;

        public Hand(String hand, boolean isPreferred, int x) {
            this.baseX = x;
            this.hand = hand;
            this.preference = isPreferred ? 0.5f : 0;
            this.x = x;
            this.y = 3;
        }

        public float distance(int x, int y) {
            if (x == baseX) return 0;
            int distance = Math.abs(x - this.x) + Math.abs(y - this.y);
            return distance - preference;
        }

        public void move(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private int getX(int number) {
        if (number == 0) {
            return 1;
        }

        return ((number - 1) % 3);
    }

    private int getY(int number) {
        if (number == 0) {
            return 3;
        }

        return ((number - 1) / 3);
    }

    private Hand press(int number, Hand right, Hand left) {
        int x = getX(number);
        int y = getY(number);

        float rDistance = right.distance(x, y);
        float lDistance = left.distance(x, y);

        Hand hand;
        if (rDistance > lDistance) {
            hand = left;
        } else {
            hand = right;
        }

        hand.move(x, y);
        return hand;
    }

    @Override
    public String solution(int[] numbers, String hand) {
        Hand right = new Hand("R", hand.equals("right"), 2);
        Hand left = new Hand("L", hand.equals("left"), 0);

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            Hand pressedHand = press(number, right, left);
            sb.append(pressedHand.hand);
        }

        return sb.toString();
    }
}
