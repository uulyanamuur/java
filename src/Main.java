public class Main {
    public static void main(String[] args) {
        MyList<Item> list = new MyList<>();
        Item item = new Dish("meal", 10, "ansdna");
        Item item2 = new Dish("pizza1", 20, "ansdna");
        Item item3 = new Dish("pizza2", -1, "ansdna");
        Item item4 = new Dish("pizza3", 15, "ansdna");
        list.push(item);
        list.push(item2);
        list.push(item3);
        list.push(item4);
        for (Item a : list.ListToTArray() ) {
            System.out.println(a.getName());
        }
    }
}