public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Book b1 = new Book("War and peace", 1000);
        Book b2 = new Book("Crime and Punishment");
        b2.setPages(500);
        System.out.println(b1);
        System.out.println(b2);

        Ball B1 = new Ball("blue", 10);
        Ball B2 = new Ball("", 30);
        B2.setColor("red");
        System.out.println(B1);
        System.out.println(B2);
    }
}