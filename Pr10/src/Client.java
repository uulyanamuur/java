public class Client {

    public Chair chair;

    Client(Chair chair){
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Sitting on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Client, chair = " + chair;
    }
}