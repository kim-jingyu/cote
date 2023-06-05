package cote.baekjoon.silver;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

class NO16198Test {
    NO16198 no = new NO16198();

    @Test
    void test1() throws IOException {
        String input = "4\n" +
                "1 2 3 4";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("12\n");
    }

    @Test
    void test2() throws IOException {
        String input = "5\n" +
                "100 2 1 3 100";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("10400\n");
    }

    @Test
    void test3() throws IOException {
        String input = "7\n" +
                "2 2 7 6 90 5 9";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("1818\n");
    }

    @Test
    void test4() throws IOException {
        String input = "10\n" +
                "1 1 1 1 1 1 1 1 1 1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("8\n");
    }
}