package book.ch6.carpet;

public class CarpetV1 implements Carpet{
    public int[] solution(int brown, int yellow) {
        for (int width = 3; width <= 5000; width++) {
            for (int height = 3; height <= width; height++) {
                int boundary = 2 * (width + height - 2);
                int center = width * height - boundary;

                if (boundary == brown && center == yellow) {
                    return new int[]{width, height};
                }
            }
        }
        return null;
    }
}
