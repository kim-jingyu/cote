package book.ch9.add_non_existing_number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AddNonExistingNumberTest {
    AddNonExistingNumber addNonExistingNumber = new AddNonExistingNumberV0();

    @Test
    void test1() {
        assertThat(addNonExistingNumber.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0})).isEqualTo(14);
    }
}