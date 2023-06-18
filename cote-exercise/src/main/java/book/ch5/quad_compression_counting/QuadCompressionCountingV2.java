package book.ch5.quad_compression_counting;

public class QuadCompressionCountingV2 implements QuadCompressionCounting{
    private static class Count {
        private final int zero;
        private final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count addCount(Count other) {
            return new Count(other.zero + zero, other.one + one);
        }
    }

    @Override
    public int[] solution(int[][] arr) {
        Count count = getCount(0, 0, arr.length, arr);
        return new int[]{count.zero, count.one};
    }

    private Count getCount(int offsetX, int offsetY, int size, int[][] arr) {
        int resize = size / 2;
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    return getCount(offsetX, offsetY, resize, arr)
                            .addCount(getCount(offsetX + resize, offsetY, resize, arr))
                            .addCount(getCount(offsetX, offsetY + resize, resize, arr))
                            .addCount(getCount(offsetX + resize, offsetY + resize, resize, arr));
                }
            }
        }

        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }
}
