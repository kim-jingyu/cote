package book.ch9.remove_duplicated_char;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedCharV0 implements RemoveDuplicatedChar{
    @Override
    public String solution(String my_string) {
        Set<Character> used = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (!used.contains(c)) {
                used.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
