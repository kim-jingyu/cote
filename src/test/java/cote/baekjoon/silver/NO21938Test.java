package cote.baekjoon.silver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NO21938Test {
    NO21938 no = new NO21938();

    @Test
    void test1() throws IOException {
        String input = "3 3\n" +
                "255 255 255 100 100 100 255 255 255\n" +
                "100 100 100 255 255 255 100 100 100\n" +
                "255 255 255 100 100 100 255 255 255\n" +
                "101";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("5\n");
    }

    @Test
    void test2() throws IOException {
        String input = "2 2\n" +
                "124 150 123 100 100 100\n" +
                "103 103 103 183 5 3\n" +
                "255";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("0\n");
    }
}