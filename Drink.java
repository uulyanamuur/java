public final class  Drink implements Item{
    final private String name;
    final private double cost;
    final private String description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(String name, double cost, String description) {
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}