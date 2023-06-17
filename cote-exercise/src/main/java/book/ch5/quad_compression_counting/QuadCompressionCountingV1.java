package book.ch5.quad_compression_counting;

// (offsetX, offsetY, size)
public class QuadCompressionCountingV1 implements QuadCompressionCounting{
    private static class Count {
        private final int zero;
        private final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count addCount(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }
    @Override
    public int[] solution(int[][] arr) {
        Count count = getCount(arr, 0, 0, arr.length);
        return new int[]{count.zero, count.one};
    }

    private Count getCount(int[][] arr, int offsetX, int offsetY, int size) {
        int resize = size / 2;
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    return getCount(arr, offsetX, offsetY, resize)
                            .addCount(getCount(arr, offsetX + resize, offsetY, resize))
                            .addCount(getCount(arr, offsetX, offsetY + resize, resize))
                            .addCount(getCount(arr, offsetX + resize, offsetY + resize, resize));
                }
            }
        }

        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }
}
