package theory.composite;

public abstract class Node {
    private String name; // 폴더와 파일의 이름

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract long getSize();
    public abstract boolean isFolder();
}
