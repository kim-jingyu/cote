package theory.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetMain2 {
    public static void main(String[] args) {
        Set<MyData> set = new HashSet<>();
        set.add(new MyData("kim", 10));
        set.add(new MyData("lee", 20));
        set.add(new MyData("hong", 30));
        set.add(new MyData("hong", 30));

        Iterator<MyData> iter = set.iterator();
        while (iter.hasNext()) {
            MyData data = iter.next();
            System.out.println("data = " + data);
        }
    }
}

class MyData {
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}