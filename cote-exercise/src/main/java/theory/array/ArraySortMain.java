package theory.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortMain {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 1000);
        items[1] = new Item("python", 2000);
        items[2] = new Item("C#", 3000);
        items[3] = new Item("javascript", 4000);
        items[4] = new Item("Dart", 5000);

        Arrays.sort(items, (item1, item2) ->
                    item1.getName().compareTo(item2.getName())
        );

        for (Item item : items) {
            System.out.println("item = " + item);
        }
    }
}

class ItemSorter implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return item1.getName().compareTo(item2.getName());
    }
}


class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Item i = (Item) o;
        return this.name.compareTo(i.name); // 양수, 0, 음수
    }
}