package book.ch7.menu_rewal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MenuRenewalTest {
    MenuRenewal menuRenewal = new MenuRenewalV0();

    @Test
    void test1() {
        assertThat(menuRenewal.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4})).isEqualTo(new String[]{"AC", "ACDE", "BCFG", "CDE"});
    }

    @Test
    void test2() {
        assertThat(menuRenewal.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5})).isEqualTo(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
    }

    @Test
    void test3() {
        assertThat(menuRenewal.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4})).isEqualTo(new String[]{"WX", "XY"});
    }
}