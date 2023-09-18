package theory.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    private List<Node> nodes; // 폴더는 노드를 여러 개 가질 수 있다.

    public Folder(String name) {
        super(name);
        nodes = new ArrayList<>();
    }

    public void add(File file) {
        nodes.add(file);
    }

    public void add(Folder folder) {
        nodes.add(folder);
    }

    @Override
    public long getSize() {
        long total = 0L;
        for (int i = 0; i < nodes.size(); i++) {
            total += nodes.get(i).getSize(); // 폴더면 폴더의 getSize. 즉, 현재 메서드 반복.
        }
        return total;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
