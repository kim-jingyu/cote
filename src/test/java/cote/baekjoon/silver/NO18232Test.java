package cote.baekjoon.silver;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

class NO18232Test {
    NO18232 no = new NO18232();

    @Test
    void test1() throws IOException {
        String input = "10 3\n2 5\n1 6\n1 3\n2 8";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        no.main(null);

        assertThat(out.toString()).isEqualTo("3\n");
    }
}