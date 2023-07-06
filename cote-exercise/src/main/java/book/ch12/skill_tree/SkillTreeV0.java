package book.ch12.skill_tree;

public class SkillTreeV0 implements SkillTree{
    @Override
    public int solution(String skill, String[] skill_trees) {
        int cnt = 0;
        for (String skillTree : skill_trees) {
            String replaced = skillTree.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(replaced)) {
                cnt++;
            }
        }

        return cnt;
    }
}
