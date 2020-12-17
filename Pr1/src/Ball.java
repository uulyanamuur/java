public class Ball {
    private String color;
    private double radius;
    public Ball(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public Ball(String color){
        this.color = color;
        radius = 0;
    }
    public Ball(){
        color = "green";
        radius = 15;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void sport() {
        System.out.println("Let's play with " + this.color + " ball!");
    }
}
