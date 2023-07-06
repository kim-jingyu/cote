package book.ch12.skill_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SkillTreeTest {
    SkillTree skillTree = new SkillTreeV0();

    @Test
    void test1() {
        assertThat(skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"})).isEqualTo(2);
    }

}